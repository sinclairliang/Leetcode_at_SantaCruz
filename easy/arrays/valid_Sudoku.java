class Solution {
    public boolean isValidSudoku(char[][] board) {
        // by using hashset, hashset will return true if the element
        // is not yet in the hashset;
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            Set<Character> cube = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                int x = (3 * i) / 3 + j / 3;
                int y = (i % 3) * 3 + j % 3;
                // all the cells in that cube/square;
                if ((board[i][j] != '.' && !row.add(board[i][j])) || (board[j][i] != '.' && !col.add(board[j][i]))
                        || board[x][y] != '.' && !cube.add(board[x][y])) {
                    return false;
                }
            }
        }
        return true;
    }
}