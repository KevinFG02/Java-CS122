package Week8.IndividualAssignment.program;

import Week8.IndividualAssignment.cards.Card;
import Week8.IndividualAssignment.enums.Rank;
import Week8.IndividualAssignment.enums.Suit;

/**
 * A class that represents a playing card.
 * @author Kevin Flores
 * @version 1.0
 *
 * Created on 3/08/26
 */

public class PlayingCard implements Card {
    /**
     * Fields that represent card suit and rank enums.
     */
    private Suit suit;
    private Rank rank;

    /**
     * @param suit Represents an enum from the Suit file.
     * @param rank Represents an enum from the Rank file.
     */
    public PlayingCard(Suit suit, Rank rank){
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * @return Returns the rank of a card.
     */
    public Rank getRank(){
        return this.rank;
    }

    /**
     * @return Returns the suit of a card.
     */
    public Suit getSuit(){
        return this.suit;
    }

    /**
     * @return Returns the value of a card.
     */
    @Override
    public int getValue(){
        int cardValue = 0;

        if(rank == Rank.TWO){
            cardValue = 2;
        } else if (rank == Rank.THREE){
            cardValue = 3;
        } else if (rank == Rank.FOUR){
            cardValue = 4;
        } else if (rank == Rank.FIVE){
            cardValue = 5;
        } else if (rank == Rank.SIX){
            cardValue = 6;
        } else if (rank == Rank.SEVEN){
            cardValue = 7;
        } else if (rank == Rank.EIGHT){
            cardValue = 8;
        } else if (rank == Rank.NINE){
            cardValue = 9;
        } else if (rank == Rank.TEN){
            cardValue = 10;
        } else if (rank == Rank.JACK){
            cardValue = 10;
        } else if (rank == Rank.QUEEN){
            cardValue = 10;
        } else if (rank == Rank.KING){
            cardValue = 10;
        } else if (rank == Rank.ACE){
            cardValue = 11;
        }

        return cardValue;
    }

    /**
     * @return Returns the name of a card.
     */
    @Override
    public String getCardName(){
        String cardRank = "";
        String cardSuit = "";

        if(suit == Suit.HEARTS){
            cardSuit = "Hearts";
        } else if (suit == Suit.CLUBS){
            cardSuit = "Clubs";
        } else if (suit == Suit.SPADES){
            cardSuit = "Spades";
        } else if (suit == Suit.DIAMONDS){
            cardSuit = "Diamonds";
        }

        if(rank == Rank.TWO){
            cardRank = "2";
        } else if (rank == Rank.THREE){
            cardRank = "3";
        } else if (rank == Rank.FOUR){
            cardRank = "4";
        } else if (rank == Rank.FIVE){
            cardRank = "5";
        } else if (rank == Rank.SIX){
            cardRank = "6";
        } else if (rank == Rank.SEVEN){
            cardRank = "7";
        } else if (rank == Rank.EIGHT){
            cardRank = "8";
        } else if (rank == Rank.NINE){
            cardRank = "9";
        } else if (rank == Rank.TEN){
            cardRank = "10";
        } else if (rank == Rank.JACK){
            cardRank = "Jack";
        } else if (rank == Rank.QUEEN){
            cardRank = "Queen";
        } else if (rank == Rank.KING){
            cardRank = "King";
        } else if (rank == Rank.ACE){
            cardRank = "Ace";
        }

        return cardRank + " of " + cardSuit;
    }

    /**
     * Creates a string for the card.
     * @return Returns a string.
     */
    @Override
    public String toString(){
        return getCardName();
    }
}
