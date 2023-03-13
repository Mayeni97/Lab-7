/*
 * Mayowa 
 * Lab 7
 */

import java.util.ArrayList;

public class GameOfChance<T extends Rollable> {
    private ArrayList<T> mylist = new ArrayList<>();
    private String currentPlay;

    public void add(T rollable) {
        mylist.add(rollable);
    }

    
    public String play() {
        currentPlay = "";
        for (T item : mylist) {
            currentPlay += item.rollRandom() + " ";

        }
        return currentPlay;

    }

    public boolean winner() {
        String[] rollStrings = currentPlay.trim().split(" ");
        for (int i = 0; i < rollStrings.length - 1; i++) {
            if (!rollStrings[i].equals(rollStrings[i + 1]))
                return false;
        }
        return true;

    }

    // determine if the winner passed in winner = current play
    public Boolean winner(String winner) {
        return false;
    }

}
