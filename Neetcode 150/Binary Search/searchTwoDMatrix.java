// 74 - Search a 2D matrix

    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // iterates over the row
        for (int r = 0; r < matrix.length; r++) {

            // iterates over the column of the row
            // matrix[r].length gives the number of columns in row r
            for (int c = 0; c < matrix[r].length; c++) {

                // checks if it is equal to the target
                if (matrix[r][c] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}