/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {

        // Continue loop until win or draw is detected
        while (!gameOver) {

            if (isHumanTurn) {
                // Human player makes their move
                humanMove();
            } else {
                // Computer player makes a random valid move
                computerMove();
            }

            // After each move, check for a win
            if (checkWin()) {
                printBoard();
                if (isHumanTurn) {
                    System.out.println("Congratulations! You win!");
                } else {
                    System.out.println("Computer wins! Better luck next time.");
                }
                gameOver = true; // Stop the loop — win detected

            // Check for a draw (no winner, board is full)
            } else if (checkDraw()) {
                printBoard();
                System.out.println("It's a draw! Well played.");
                gameOver = true; // Stop the loop — draw detected

            } else {
                // No winner yet — switch turns and continue
                isHumanTurn = !isHumanTurn;
            }
        }
    }

    // -------------------------------------------------------
    // Stub methods — replace with your actual implementations
    // from UC5, UC6, and UC7
    // -------------------------------------------------------

    /** UC6 — Prompts human for a slot and places their symbol */
    static void humanMove() {
        // Your UC6 implementation here
    }

    /** UC7 — Generates a random valid slot and places computer symbol */
    static void computerMove() {
        // Your UC7 implementation here
    }

    /** UC4 — Returns true if the current player has three in a row */
    static boolean checkWin() {
        // Your UC4 implementation here
        return false;
    }

    /** UC5 — Returns true if all 9 slots are filled with no winner */
    static boolean checkDraw() {
        // Your UC5 implementation here
        return false;
    }

    /** Prints the current board state */
    static void printBoard() {
        // Your printBoard implementation here
    }
}