import java.util.*;

public class findMinDIff {
    public long findMinDiff(ArrayList<Integer> a, int N, int K) {
        if (a.size() == 0) {
            return 0;
        }

        // sort the array so to get the nearest min value
        Collections.sort(a);
        long res = Long.MAX_VALUE;

        // performing sliding window
        for (int i = 0; i < N - K + 1; i++) {
            int min = a.get(i);
            int max = a.get(i + K - 1);
            res = Math.min(res, max - min);
        }
        return res;
    }
}
