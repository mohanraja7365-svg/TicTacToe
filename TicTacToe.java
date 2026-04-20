import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    // ── Game State Variables ──────────────────────────────────────────
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program. Executes the toss logic and displays
     * the result of turn and symbol assignment.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome. This method initializes the game state.
     */
    static void tossAndAssignSymbols() {

        // Step 1: Random Number Generation
        Random random = new Random();
        int toss = random.nextInt(2);   // generates 0 or 1

        // Step 2: Conditional Logic — decide winner and assign symbols
        if (toss == 0) {
            // Human wins the toss → gets X and plays first
            isHumanTurn   = true;
            humanSymbol    = 'X';
            computerSymbol = 'O';
        } else {
            // Computer wins the toss → gets X and plays first
            isHumanTurn   = false;
            humanSymbol    = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {

        System.out.println("=== Toss Result ===");

        // Step 3: Read stored game state and report outcome
        if (isHumanTurn) {
            System.out.println("Human wins the toss and plays FIRST.");
        } else {
            System.out.println("Computer wins the toss and plays FIRST.");
        }

        System.out.println("Human    symbol : " + humanSymbol);
        System.out.println("Computer symbol : " + computerSymbol);
        System.out.println("===================");
    }
}