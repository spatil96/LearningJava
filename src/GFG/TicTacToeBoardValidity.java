package GFG;

public class TicTacToeBoardValidity {

        int[][] win = {{0, 1, 2},  // Check first row.
                {3, 4, 5},  // Check second Row
                {6, 7, 8},  // Check third Row
                {0, 3, 6},  // Check first column
                {1, 4, 7},  // Check second Column
                {2, 5, 8},  // Check third Column
                {0, 4, 8},  // Check first Diagonal
                {2, 4, 6}}; // Check second Diagonal

    public int isCWin(char[] board, char c) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (board[win[i][0]] == c && board[win[i][1]] == c &&
                    board[win[i][2]] == c) {
                count++;
            }
        }
        return count;
    }
    public boolean isValid(char[] board) {
        // Count number of 'X' and 'O' in the given board
        int xCount = 0, oCount = 0;
        for (char c : board) {
            if (c == 'X') {
                xCount++;
            } else if (c == 'O') {
                oCount++;
            }
        }

        int cx = isCWin(board, 'X');
        int co = isCWin(board, 'O');

        // Board can be valid only if either xCount and oCount
        // is same or xCount is one more than oCount
        if (xCount != oCount + 1) {
            return false;
        }

        if (co == 1 && cx == 0) {
            return true;
        }

        if (cx == 1 && co == 0) {
            return true;
        }

        if (cx == 0 && co == 0) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        TicTacToeBoardValidity solution = new TicTacToeBoardValidity();
        char[] board = {'X', 'X', 'X', 'O', 'O', ' ', ' ', ' ', ' '};
        System.out.println(solution.isValid(board)); // Expected output: true or false
    }
}
