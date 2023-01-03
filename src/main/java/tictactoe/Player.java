package tictactoe;

import java.util.Scanner;

/**
 * The class defines the name
 * and symbol of player 1 and 2
 * by acquiring input
 */
public class Player {
        private final String name;
        private final String symbol;

    /**
     * The method asks for the user input
     * and initializes the response
     * with the name variable
     */
        public Player(String sym) {
            System.out.print("Enter Name: ");
            Scanner input = new Scanner(System.in);
            this.name = input.next();
            this.symbol = sym;

        }
        //getter for name variable
         public String getName() {
            return this.name;
        }
        //getter for symbol variable
        public String getSymbol() {
            return this.symbol;
        }
    }

