class Solution {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        backtrack(0, board, n);
        return res;
    }

    private void backtrack(int row, int[][] board, int n) {

        if (row == n) {
            res.add(constructBoard(board, n));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, board, n)) {

                board[row][col] = 1;          // Place queen

                backtrack(row + 1, board, n); // Recurse

                board[row][col] = 0;          // Backtrack
            }
        }
    }

    private boolean isSafe(int row, int col, int[][] board, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    private List<String> constructBoard(int[][] board, int n) {

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1)
                    sb.append('Q');
                else
                    sb.append('.');
            }

            temp.add(sb.toString());
        }

        return temp;
    }
}