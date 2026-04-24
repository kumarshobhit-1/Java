public class nQueen {
    public static boolean isSafe(char board[][], int row, int col){
        // vertical up
         for(int i=row-1; i>=0; i--){
            if (board[i][col] == 'Q') {
                return false;
            }
         }
        // diagonal left up
         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if (board[i][j] == 'Q') {
                return false;
            }
         }
        // diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board); // this line for print all solution 
            count++; // for count ways 
            return true;
        }

        // coloumn row
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][i] = '.'; // backtracking step
            }
        }

        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------------- chess board --------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0; // static variable for count ways 
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }
        
        System.out.println("total ways to solve n queens = " + count);
    }
}