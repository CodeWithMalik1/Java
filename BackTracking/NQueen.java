public class NQueen {

    // Method to check if a queen can be safely placed at (row, col)
    public static boolean isSafe(char board[][], int row, int col) {
        // Check vertical upward
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false; // Another queen found in the same column
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false; // Another queen found in upper left diagonal
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false; // Another queen found in upper right diagonal
            }
        }

        return true; // No threats, it's safe
    }

    // Recursive function to solve N-Queen  
    public static void Nqueen(char board[][], int row) {
        // Base case: all queens are placed
        if (row == board.length) {
            printBoard(board); // Print the solution
            c++;
            return;
        }

        // Try to place a queen in every column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {     // FIXED: Place queen only if safe!
                board[row][j] = 'Q';         // Place queen
                Nqueen(board, row + 1);      // Recurse for next row
                board[row][j] = 'X';         // Remove queen (backtracking)
            }
        }
    }

    // Utility function to print the board
    
    public static void printBoard(char board[][]) {
        if(c==1){
        System.out.println("------chess Board------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // else System.out.println("No solutions");
}
    static int c=0;

    // Main function to set up the board and start recursion
    public static void main(String[] args) {
        int n = 4; // Change this to solve for a different size
        char board[][] = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        Nqueen(board, 0); // Start solving from row 0
        System.out.println("No of ways are : " +c);
    }
}
