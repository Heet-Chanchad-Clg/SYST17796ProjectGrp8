/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

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

// THis class contains the details of the players extending the player class
// as well as the details of cards.

public class WarPlayer extends Player {
    private ArrayList<PlayingCard> hand;

//    This method defines the name of the player and gives them cards.
    public WarPlayer(String name, ArrayList<PlayingCard> hand) {
        super(name);
        this.hand = hand;
    }

//    This method plays the hand and removes it from the list.
    public PlayingCard playCard() {
        return hand.isEmpty() ? null : hand.remove(0);
    }

// This method adds the cards when there is a war between the players.
    public void addCards(ArrayList<PlayingCard> cards) {
        hand.addAll(cards);
    }
    
    
//    THis method is used to make sure there is sufficient cards to play,
//    or the winner is declared on the basis of previous wins.
    public ArrayList<PlayingCard> getHand() {
        return hand;
    }
    
    

    @Override
    public void play() {
        // Logic for each round's play can go here
    }
}

