/**
 * TicTacToe
 * UC9 checks whether a player has won by examining
 * rows, columns, and diagonals.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Tests the win-check logic.
     */
    public static void main(String[] args) {
        System.out.println(hasWon('X'));
    }

    /**
     * Checks all possible winning patterns for the given symbol.
     * Input: Player symbol
     * Output: true if win detected.
     */
    static boolean hasWon(char symbol) {

        // --- Check all 3 rows ---
        // A row wins if every cell in that row matches the symbol
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == symbol &&
                board[row][1] == symbol &&
                board[row][2] == symbol) {
                return true; // Winning row found
            }
        }

        // --- Check all 3 columns ---
        // A column wins if every cell in that column matches the symbol
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == symbol &&
                board[1][col] == symbol &&
                board[2][col] == symbol) {
                return true; // Winning column found
            }
        }

        // --- Check top-left → bottom-right diagonal ---
        // Positions: (0,0), (1,1), (2,2)
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // --- Check top-right → bottom-left diagonal ---
        // Positions: (0,2), (1,1), (2,0)
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        // No winning pattern found
        return false;
    }
}