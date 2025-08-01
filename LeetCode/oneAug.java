// 118 - Pascal's Triangle
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // to store the result triangle
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        //Initialize first row as 1 and add to the res traingle
        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1);

            // will not run for 2nd row as 1 < 1
            for (int j = 1; j < i; j++) {
                curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            curr_row.add(1);
            triangle.add(curr_row);
        }
        return triangle;
    }

}