/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

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

// We extend the card class here to put the hands in the playingCard
// these, will be utilized in the game when playing.
public class PlayingCard extends Card {
    private final Suit suit;
    private final Rank rank;

  
    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

//    THis method will return the rank of the card at hand in integer format.
     public int getRankValue() {
        return rank.getValue();
    }

//     THis returns the suit of type enum.
    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
