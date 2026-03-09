package Week8.IndividualAssignment.program;

import Week8.IndividualAssignment.enums.Rank;
import Week8.IndividualAssignment.enums.Suit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * A program that simulates a card game.
 * @author Kevin Flores
 * @version 1.0
 *
 * Created on 3/08/26
 */

public class CardGameProgram
{
    public static void main(String[] args)
    {
        // Introduction
        System.out.println("⠀⠀⢠⣾⡿⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣆");
        System.out.println("⠀⠀⣿⠃⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣷⣀⢀⠀⣀⣀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣿⣿⣏⣀⣘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⡏⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⡟⣼⣆⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⡿⣰⣿⣿⡄⠘⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⢡⣭⣭⣭⣭⡀⠸⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣿⣿⣿⠿⠋⠸⢿⣿⣿⡿⠷⠀⠹⢿⣿⣿⣿⣿⣿");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡍⠉⣹⣿⣿");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠉⠉⠀⠁⠉⢿");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⢠⣿");
        System.out.println("⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣤⣾⡿⠏");

        // Inputs
        System.out.println("Play a Game!");
        Scanner askUser = new Scanner(System.in);
        System.out.println("Player 1 Name: ");
        String player1 = askUser.next();
        System.out.println("Player 2 Name: ");
        String player2 = askUser.next();
        System.out.println("How many rounds?");
        int roundOfGames = askUser.nextInt();
        System.out.println("Deck Shuffled!");

        Random randomCard = new Random();
        int playerScore1 = 0;
        int playerScore2 = 0;

        // 52-Deck
        ArrayList<PlayingCard> deckOfCards = new ArrayList<>();
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                PlayingCard cardName = new PlayingCard(suit,rank);
                deckOfCards.add(cardName);
            }
        }

        // Game Rounds
        for(int i = 0; i < roundOfGames; i++){
            int card1 = randomCard.nextInt(Suit.values().length * Rank.values().length);
            int card2 = randomCard.nextInt(Suit.values().length * Rank.values().length);

            // Players
            System.out.println(player1 + " is dealt a " + deckOfCards.get(card1));
            int cardValue1 = deckOfCards.get(card1).getValue();
            System.out.println(player2 + " is dealt a " + deckOfCards.get(card2));
            int cardValue2 = deckOfCards.get(card2).getValue();

            // Winner Of Round
            if(cardValue1 > cardValue2){
                System.out.println(player1 + " won this round!");
                playerScore1 = playerScore1 + 1;
            } else if (cardValue1 < cardValue2){
                System.out.println(player2 + " won this round!");
                playerScore2 = playerScore2 + 1;
            } else {
                System.out.println("Its a tie for this round!");
            }
        }

        // Total Score
        System.out.println(player1 + " wins : " + playerScore1);
        System.out.println(player2 + " wins: " + playerScore2);

        if(playerScore1 > playerScore2){
            System.out.println(player1 + " wins");
        } else if (playerScore1 < playerScore2){
            System.out.println(player2 + " wins");
        } else {
            System.out.println(player1 + " and " + player2 + " tie!");
        }
    }
}
