package tictactoe;
/**
 * The class is used for the main
 * to run and to print out a welcome
 * statement for user.
 */
public class Runner {
    public static void main(String[] args) {
        // prints a welcome message for the players
        System.out.println("Hello! Welcome to TicTacToe! Please enter both players name one at a time.");
        new Game().play();
    }
}
