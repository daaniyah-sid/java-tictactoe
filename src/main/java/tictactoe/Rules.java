package tictactoe;

import java.util.ArrayList;

/**
 * The class is created to set the rules
 * of the tictactoe game to conclude if
 * game has been won by a player.
 */
public class Rules {

    //checks to see if index's forming a diagonal line are filled to declare winner
    private boolean areWinningDiagonalsFull(ArrayList<String> state) {
        return (state.get(0) != "") && (state.get(0) == state.get(4)) && (state.get(4) == state.get(8))
                || (state.get(2)!= "") && (state.get(2) == state.get(4)) && (state.get(4) == state.get(6));
    }
    //checks to see if index's forming a vertical line are filled to declare winner
    private boolean areWinningColumnsFull(ArrayList<String> state) {
        return (state.get(0) != "") && (state.get(0) == state.get(3)) && (state.get(3) == state.get(6))
                || (state.get(1) != "") && (state.get(1) == state.get(4)) && (state.get(4)== state.get(7))
                || (state.get(2) != "") && (state.get(2) == state.get(5)) && (state.get(5) == state.get(8));
    }
    //checks to see if index's forming a horizontal line are filled to declare winner
    private boolean areWinningRowsFull(ArrayList<String> state) {
        return (state.get(0) != "") && (state.get(0) == state.get(1)) && (state.get(1) == state.get(2))
                || (state.get(3) != "") && (state.get(3) == state.get(4)) && (state.get(4) == state.get(5))
                || (state.get(6) != "") && (state.get(6) == state.get(7)) && (state.get(7) == state.get(8));
    }
    //will return specified method if requirements are met to declare a win
    public boolean isGameWon(ArrayList<String> state) {
        return this.areWinningDiagonalsFull(state)
                || this.areWinningColumnsFull(state)
                || this.areWinningRowsFull(state);
    }
}
