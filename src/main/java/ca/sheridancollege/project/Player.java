/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;


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


/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 */
public abstract class Player {

    private String name; //the unique name for this player
    private List<Card> hand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();
    
    // Adds a card to the player's hand
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    // Calculates the player's score
    public int getScore() {
        // Simplified score calculation logic for demonstration purposes
        return hand.size(); // Replace with actual logic as needed
    }   
    
    
    

}
