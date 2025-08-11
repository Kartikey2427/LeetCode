import java.util.*;

public class firstNegElement {

    public long[] printFirstNeg(long arr[], int N, int K) {
        Queue<Long> queue = new LinkedList<>();

        // calculate for the first window
        int index = 0;
        while (index < K) {
            if (arr[index] < 0) {
                queue.offer(arr[index]);
            }
            index++;
        }

        long res[] = new long[N - K + 1];
        res[0] = queue.isEmpty() ? 0 : queue.peek();

        // sliding the window
        for (int i = 1; i < N - K + 1; i++) {
            if (arr[i - 1] < 0) {
                queue.poll();
            }
            if (arr[i + K - 1] < 0) {
                queue.offer(arr[i + K - 1]);
            }
            res[i] = queue.isEmpty() ? 0 : queue.peek();
        }
        return res;
    }
}
