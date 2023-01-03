package tictactoe;

import java.util.ArrayList;

/**
 * The class is used to create board for
 * the tictactoe game, print out the board
 * display, and checks for invalid input
 * by using a string array.
 */
public class Board {
    private ArrayList<String> state = new ArrayList<String>();
    private final int sides = 3;

    // creates the index of the board as it iterates over 9
    public Board() {
        for (int i = 0; i < sides * sides; i++) {
            state.add(""); // 1,2,3,4,5,6,7,8,9
        }
    }
    public int getNumberOfCells() {
       return this.sides * this.sides;
    }

   /**
     0 | 1 | 2
     3 | 4 | 5
     6 | 7 | 8
   */
    //prints out the correct format of board as it iterates over length of state
    public void display() {

        for(int i = 0; i < state.size(); i++) {

            String cellValue = state.get(i);

            if (cellValue == "") {
                System.out.print(i);
            } else {
                System.out.print(cellValue);
            }
            // if i plus 1 is divided by 3 and the remainder is 0, a new line is inputted
            if ((i+1) % 3 == 0) {
                System.out.print("\n");

            } else {
                System.out.print(" | ");
            }
        }
    }
    //method created for error handling
    public boolean setBoardState(int index, String currentPlayerSymbol) {

        boolean didSet = true;
        try {
            // set as true if inputted index is unfilled
            if (state.get(index) == "") {
                state.set(index, currentPlayerSymbol);
            } else {
                // set to false if index is already filled from previous input, prints out error message
                didSet = false;
                System.out.println("Error - Index is already filled, please enter again.");
            }
            // set to false if index entered is out of range 0-8, prints out error message
        } catch(IndexOutOfBoundsException exception){
            didSet = false;
            System.out.println("Error - The value entered is out of range. Please enter a value between 0 and 8.");

        }
        return didSet;
    }

    public ArrayList<String> getState() {
        return this.state;
    }

}
