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
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<PlayingCard> cards;
    private int size;//the size of the grouping
    
    
//    THis method will generate all possible hands from the deck and 
//    store it in an arraylist to use when the game starts.
    public GroupOfCards() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new PlayingCard(suit, rank));
            }
        }
    }
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

//    THis emthod is used to shuffle the card to randomize them.
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
//    As there are 2 players to this game, we divide the deck into two parts 
//    by impleenting the method below using the subList() method.
    public ArrayList<PlayingCard> dealHalfDeck() {
        ArrayList<PlayingCard> halfDeck = new ArrayList<>(cards.subList(0, 26));
        cards = new ArrayList<>(cards.subList(26, cards.size()));
        return halfDeck;
    }

}//end class
