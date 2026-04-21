/**
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1));  // true  → center cell is empty
        board[1][1] = 'X';
        System.out.println(isValidMove(1, 1));  // false → cell now occupied
        System.out.println(isValidMove(3, 3));  // false → out of bounds
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input:  Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // 1. Boundary check — row and col must be within 0–2
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Empty cell check — cell must still be '-'
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}