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

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any
 * Cardgame. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

    
// Here, added the Suit and Rank enums to make the code more reinforced.
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    
// It was hard to use text enum for the game so we added values to it with 
// a method to retrieve the value in the form of int.
    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
        EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

        private final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
