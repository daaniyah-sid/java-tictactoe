package tictactoe;

import java.util.Scanner;

/**
 * The class is used to set the symbol
 * of each player, declare who's turn
 * it is, and conclude if game has won
 * or has ended in draw.
 */
public class Game {

    private Player p1;
    private Player p2;
    private Board board;
    private Rules rules;

    //resets variables to new
    public Game() {
        this.p1 = new Player("X");
        this.p2 = new Player("O");
        this.board = new Board();
        this.rules = new Rules();
    }

    //prints congrats message including the name of player who has won
    private void declareWin(Player p) {
        System.out.print("Congrats! You have won the game ");
        System.out.print(p.getName());
        System.out.println("!");
    }

    //method to receive inout of value from board
    public void play() {
        Player current = this.p1;
        Player alternative = this.p2;
        int numberOfTurns = 0;
        this.board.display();
        Scanner input = new Scanner(System.in);

        //will run if the total number of turns of the players is 9, since 9 would conclude a draw
        while(numberOfTurns < 9) {
            System.out.print("Player Turn: ");
            System.out.println(current.getName());

            while(true) {
                System.out.print("Enter a number from 0 to 8: ");
                int index = input.nextInt();
                System.out.println();


                if(this.board.setBoardState(index, current.getSymbol())) {
                    break;
                } else {
                    continue;
                }
            }
            // increment total number of turns each time
            numberOfTurns++;
            // prints out board display
            this.board.display();

            // if any instance of a win has occurred, winner is declared
            if(this.rules.isGameWon(this.board.getState())) {
                declareWin(current);
                break;

                // if number of total turns equal the same amount of cells on the board, a draw is declared
            } else if(numberOfTurns == this.board.getNumberOfCells()){
                this.declareTie();
            } else {
                // variables are swapped by using a temp value
                Player temp = current;
                current = alternative;
                alternative = temp;
            }
        }
    }
    // prints message to inform players of a tie
    private void declareTie() {
        System.out.println("The game has been declared a tie!");
    }
}
