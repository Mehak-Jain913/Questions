public class NQueensProblem {

    // Entry function
    public static void solveNQueens(int n){
        int[][] board = new int[n][n];  // chessboard
        if (solveNQueensUtil(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    // Recursive function to place queens column by column
    public static boolean solveNQueensUtil(int[][] board, int col) {

        // BASE CASE: all queens placed
        if (col >= board.length) {
            return true;
        }

        // Try placing queen in every row of current column
        for (int row = 0; row < board.length; row++) {

            if (isSafe(board, row, col)) {

                // PLACE QUEEN
                board[row][col] = 1;

                // RECURSION for next column
                if (solveNQueensUtil(board, col + 1)) {
                    return true;
                }

                // BACKTRACK (remove queen)
                board[row][col] = 0;
            }
        }

        // If no row works
        return false;
    }

    // Check if queen can be placed safely
    public static boolean isSafe(int[][] board, int row, int col) {

        // Check left side row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check lower-left diagonal
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    // Print the board
    public static void printBoard(int[][] board) {
        System.out.println("Solution:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 4;
        solveNQueens(n);
    }
}
