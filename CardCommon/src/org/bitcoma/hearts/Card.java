package org.bitcoma.hearts;

import java.util.Arrays;

public class Card implements Comparable<Card> {

    // Suit values
    public static final byte SPADES = 0;
    public static final byte HEARTS = 1;
    public static final byte CLUBS = 2;
    public static final byte DIAMONDS = 3;

    // Rank values
    public static final byte TWO = 2;
    public static final byte THREE = 3;
    public static final byte FOUR = 4;
    public static final byte FIVE = 5;
    public static final byte SIX = 6;
    public static final byte SEVEN = 7;
    public static final byte EIGHT = 8;
    public static final byte NINE = 9;
    public static final byte TEN = 10;
    public static final byte JACK = 11;
    public static final byte QUEEN = 12;
    public static final byte KING = 13;
    public static final byte ACE = 14;

    private static final byte NUM_RANKS = 13;
    private byte value;

    // Specialty cards so we don't construct them multiple times
    public static final Card QUEEN_SPADES = new Card(SPADES, QUEEN);
    public static final Card TWO_CLUBS = new Card(CLUBS, TWO);
    public static final Card JACK_DIAMONDS = new Card(DIAMONDS, JACK);

    public Card(byte suit, byte rank) {
        value = (byte) (suit * NUM_RANKS + rank - 2);
    }

    public Card(byte value) {
        this.value = value;
    }

    public byte getSuit() {
        return (byte) (value / NUM_RANKS);
    }

    public byte getRank() {
        return (byte) ((value % NUM_RANKS) + 2);
    }

    public int getPoints() {
        if (getSuit() == HEARTS)
            return 1;
        if (getSuit() == SPADES && getRank() == QUEEN)
            return 13;
        return 0;
    }

    public byte getValue() {
        return value;
    }

    public static void sortCards(Card[] input) {
        Arrays.sort(input);
    }

    public static String suitString(byte suit) {
        switch (suit) {
        case 0:
            return "Spades";
        case 1:
            return "Hearts";
        case 2:
            return "Clubs";
        case 3:
            return "Diamonds";
        default:
            return "Unknown";
        }
    }

    public String toString() {
        return suitString(getSuit()) + "[" + getRank() + "]";
    }

    public boolean equals(Object o) {
        if (this.getClass() == o.getClass()) {
            Card other = (Card) o;
            if (other.getValue() == getValue())
                return true;
        }
        return false;
    }

    @Override
    public int compareTo(Card o) {
        if (this.getRank() < o.getRank())
            return -1;
        else if (this.getRank() == o.getRank())
            return 0;
        else
            return 1;
    }
}
