import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int slot;
        int row, col;

        // Loop until a valid move is found
        do {
            // Generate a random slot between 1 and 9
            slot = random.nextInt(9) + 1;

            // Convert slot to row and column (reuse conversion logic)
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

        } while (!isValidMove(row, col)); // Validate the move

        // Place the computer symbol on the board
        board[row][col] = computerSymbol;

        System.out.println("Computer placed '" + computerSymbol + "' at slot " + slot);
        printBoard();
    }

    /**
     * Validates whether a move is valid (cell must be empty).
     */
    static boolean isValidMove(int row, int col) {
        return board[row][col] == '-';
    }

    /**
     * Prints the current state of the board.
     */
    static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}