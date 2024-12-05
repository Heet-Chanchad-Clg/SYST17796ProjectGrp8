/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;



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


// This method contains the core functionality of the game war.
public class WarGame extends Game {
       
    
    private GroupOfCards deck;
    private WarPlayer player1;
    private WarPlayer player2;
    private int roundCounter;
    private int maxRounds; 
    private int player1hands;
    private int player2hands;

    
//    this is the constructor to intialize the game
    public WarGame(String name) {
        super(name);        // Using the superclass data member.
        deck = new GroupOfCards();
        deck.shuffle();

        player1 = new WarPlayer("Player 1", deck.dealHalfDeck());
        player2 = new WarPlayer("Player 2", deck.dealHalfDeck());
        player1hands = 0;
        player2hands = 0;
        roundCounter = 1;
    }

    
//    Overriding the method in the superclass that starts the game.
    @Override
    public void play() {
        
//      Used scanner class for user input.
        Scanner scanner = new Scanner(System.in);
        
//        Players can decide the number of rounds to paly before termination here.
        System.out.print("Enter the number of rounds to play: ");
        maxRounds = scanner.nextInt();
        scanner.nextLine();
        
        
        ArrayList<PlayingCard> pile = new ArrayList<>();
        
//        THe condition here stays true to continue play until the number of rounds are fulfilled
//        or either of the players pile is empty.
        while (!player1.getHand().isEmpty() && !player2.getHand().isEmpty()) {
            
            
//             ROund counter to count the rounds played.
            System.out.println("Round " + roundCounter);
            roundCounter++;
            
            PlayingCard card1 = player1.playCard();
            PlayingCard card2 = player2.playCard();
            
            pile.add(card1);
            pile.add(card2);

            System.out.print("Press Enter to get card for Player 1");
            scanner.nextLine();
            System.out.println("Player 1 plays: " + card1);
            System.out.print("Press Enter to get card for Player 2");
            scanner.nextLine();
            System.out.print("Player 2 plays: " + card2);
            
            System.out.println("");
            System.out.println("");
            
            
//            COndition to check who has the upper hand and
//            declaring the winner for that round.
            if (card1.getRankValue() > card2.getRankValue()) {
                System.out.println("Player 1 wins this round.");
                player1.addCards(pile);
                pile.clear();
                player1hands++; 
            } else if (card2.getRankValue() > card1.getRankValue()) {
                System.out.println("Player 2 wins this round.");             
                player2.addCards(pile);
                pile.clear();
                player2hands++; 
            } else {
                System.out.print("War! Press Enter to Play War:");
                scanner.nextLine();
                handleWar(pile);
            }
            
            
//            Terminates the game when the max number pf rounds are reached.
            if(roundCounter == maxRounds + 1){
                break;
            }
            
            System.out.println("");
            System.out.print("Press Enter to continue to the next round...");
            scanner.nextLine();
        }
        
        declareWinner();
        System.out.println("");
        
    }

    
//     In case of war, the method below is called
    private void handleWar(ArrayList<PlayingCard> pile) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<PlayingCard> warPile = new ArrayList<>(pile);
        
        // Both players must have enough cards to play a "war"
        if (player1.getHand().size() < 4 || player2.getHand().size() < 4) {
            System.out.println();
            declareWinner();
            return;
        }
        
//      Each players have to add three cards  in the war pile.
        for (int i = 0; i < 3; i++) {
            warPile.add(player1.playCard());
            warPile.add(player2.playCard());
        }

        // Each player add the decisive card for the war
        PlayingCard warCard1 = player1.playCard();
        PlayingCard warCard2 = player2.playCard();
        warPile.add(warCard1);
        warPile.add(warCard2);

        System.out.print("Player 1 war card: " + warCard1);
        scanner.nextLine();
        System.out.print("Player 2 war card: " + warCard2);
        scanner.nextLine();

//        Below statements decide who wan the war or war again happens if they have a draw.
//        Here, we add 4 as the three face down card as well as the card the player added0.
        if (warCard1.getRankValue() > warCard2.getRankValue()) {
            System.out.println("Player 1 wins the war.");
            player1.addCards(warPile);
            player1hands += 4;
        } else if (warCard2.getRankValue() > warCard1.getRankValue()) {
            System.out.println("Player 2 wins the war.");
            player2.addCards(warPile);
            player2hands += 4;
        } else {
            System.out.println("War again!");
            handleWar(warPile); // Recursive call for a second war if needed
        }
    }

    
//    THis method declares the winner of the whole game by overriding the superclass method.
    @Override
    public void declareWinner() {
        
//        Printing who won how many rounds.
        System.out.println();
        System.out.println("Game Over!");
        System.out.println("Player 1 won " + player1hands + " rounds.");
        System.out.println("Player 2 won " + player2hands + " rounds.");
        
        Scanner scanner = new Scanner(System.in);
        
        
//        Decision on who had the most wins to decide the winner.
        if (player1hands > player2hands) {
            System.out.println("Player 1 wins the game!");
        } else if (player2hands > player1hands) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}

