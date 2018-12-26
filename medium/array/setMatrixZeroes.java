class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> targetCol = new ArrayList<Integer>();
        ArrayList<Integer> targetRow = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    targetCol.add(j);
                    targetRow.add(i);
                }
            }
        }

        for (Integer row : targetRow) {
            for (int j = 0; j < matrix[row].length; j++) {
                matrix[row][j] = 0;
            }
        }
        for (Integer col : targetCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

    }
}
