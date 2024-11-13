/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

/**
 *
 * @author heetc
 * 
 * Group Members:
 *  
 * Mohit Parikh - 991727373
 * Heet Chanchad - 991740248
 * Dhaval Chaudhary - 991737281
 * 
 */

package ca.sheridancollege.project;

import java.util.ArrayList;

//THere are not many changes to the structure of this class 
// because we have used this class to extend other classe 
// to make the code more modular and have loose coupling between components of the code.


/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 */
public abstract class Game {

    private final String name;
    private ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
