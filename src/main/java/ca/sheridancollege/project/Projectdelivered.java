/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
// This is the main class to play the game
public class Projectdelivered {

    public static void main(String[] args) {   
        
//        Starting the new game
        WarGame game = new WarGame("War Card Game");
        game.play();
        game.declareWinner();
    }
}
