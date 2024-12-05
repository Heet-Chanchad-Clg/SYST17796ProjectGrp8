/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author heetc
 * 
 * 
 * Group Members:
 *  
 * Mohit Parikh - 991727373
 * Heet Chanchad - 991740248
 * Dhaval Chaudhary - 991737281
 * 
 * 
 */



// This class handles the generation of PlayingCard object, which improves the centralization of card creation promoting loose coupling.
// If we want a different type of card to be created in the future, this class can be extended to fulfill the requirement without changing major code structure.

public class CardFactory {
    
    // THis is the factory method used to creating a PlayingCard object.
     public static PlayingCard createCard(Card.Suit suit, Card.Rank rank) {
        return new PlayingCard(suit, rank);
     }
    
}
