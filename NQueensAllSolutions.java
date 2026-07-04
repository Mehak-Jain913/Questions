public class NQueensAllSolutions {

    static int count = 0; // to count total solutions

    public static void solveNQueens(int n) {
        int[][] board = new int[n][n];
        solveNQueensUtil(board, 0);
        System.out.println("\nTotal solutions: " + count);
    }

    // Recursive function
    public static void solveNQueensUtil(int[][] board, int col) {

        // BASE CASE: all columns filled
        if (col == board.length) {
            count++;
            System.out.println("\nSolution " + count + ":");
            printBoard(board);
            return; // do NOT stop program, just return
        }

        // Try each row in current column
        for (int row = 0; row < board.length; row++) {

            if (isSafe(board, row, col)) {

                // Place queen
                board[row][col] = 1;

                // Recurse for next column
                solveNQueensUtil(board, col + 1);

                // Backtrack (remove queen)
                board[row][col] = 0;
            }
        }
    }

    // Safety check
    public static boolean isSafe(int[][] board, int row, int col) {

        // Check same row (left side)
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

    // Print board
    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
    }
}
