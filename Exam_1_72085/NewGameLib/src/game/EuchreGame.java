package game;

import java.util.Objects;
import java.util.Random;

public class EuchreGame
{

    private Card[] cards; // масив от всички карти в тестето от карти
    private Card[] hand; // текущо изтеглена ръка от най- много 5 карти
    private String TRUMP; // константа на всяка отделна игра
    private Random random; // генератор на случайни числа
    private int dealCard; // брой карти изтеглени текущо от cards
    public static final Suit[] SUITS = {
            Suit.CLUBS,
            Suit.DIAMONDS,
            Suit.HEARTS,
            Suit.SPADES
    };
    public static final Face[] FACES = {
            Face.NINE,
            Face.TEN,
            Face.JACK,
            Face.QUEEN,
            Face.KING,
            Face.ACE
    };


    private final String ACE_STRING = "Ace";
    private final String KING_STRING = "King";
    private final String QUEEN_STRING = "Queen";
    private final String JACK_STRING = "Jack";
    private final String TEN_STRING = "Ten";
    private final String NINE_STRING = "Nine";


    public EuchreGame()
    {
        this.cards = new Card[24];
        this.hand = new Card[5];
        random = new Random();
        this.TRUMP = SUITS[random.nextInt()].toString();
        int index = 0;
        for (Face face : FACES)
        {
            for (Suit suit : SUITS)
            {
                cards[index] = new Card(face.toString(), suit.toString());
                index++;
            }

        }
    }

    public final String getTRUMP()
    {
        return this.TRUMP;
    }

    public void shuffleCards()
    {
        for (int i = 0; i < this.cards.length; i++)
        {
            int j = random.nextInt(cards.length);
            // swap two elements of the array
            Card temp = cards[j];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        this.dealCard = 0;
    }

    public String printCards()
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < hand.length; i++)
        {
            if (i % 4 == 0 && i != 0)
            {
                result.append('\n');
            }

            result.append(hand[i].toString());

            if (i != hand.length - 1)
            {
                result.append(", ");
            }

        }

        return new String(result);
    }

    public boolean dealHand()
    {
        int index = 0;
        while (index < hand.length && dealCard < cards.length)
        {
            hand[index++] = cards[dealCard++];
        }
        return dealCard < cards.length;
    }

    public int countHandStrength()
    {
        int power = 0;

        for (Card c : cards)
        {
            switch (c.getFace())
            {
                case ACE_STRING -> power += 6;
                case KING_STRING -> power += 5;
                case QUEEN_STRING -> power += 4;
                case JACK_STRING -> power += 3;
                case TEN_STRING -> power += 2;
                case NINE_STRING -> power += 1;
            }
        }
        return power;
    }


    public boolean hasJackQueenKingTrump()
    {
        boolean hasKingTrump = false;
        boolean hasQueenTrump = false;
        boolean hasJackTrump = false;

        for (Card c : hand)
        {
            if (Objects.equals(c.getFace(), Face.KING.toString()) && Objects.equals(c.getSuit(), getTRUMP()))
                hasKingTrump = true;
            if (Objects.equals(c.getFace(), Face.QUEEN.toString()) && Objects.equals(c.getSuit(), getTRUMP()))
                hasQueenTrump = true;
            if (Objects.equals(c.getFace(), Face.JACK.toString()) && Objects.equals(c.getSuit(), getTRUMP()))
                hasJackTrump = true;
        }
        return hasKingTrump && hasQueenTrump && hasJackTrump;
    }

    public boolean hasJackANDAceTrump()
    {
        boolean hasJackTrump = false;
        boolean hasAceTrump = false;

        for (Card c : hand)
        {
            if (Objects.equals(c.getFace(), Face.ACE.toString()) && Objects.equals(c.getSuit(), getTRUMP()))
                hasAceTrump = true;

            if (Objects.equals(c.getFace(), Face.JACK.toString()) && Objects.equals(c.getSuit(), getTRUMP()))
                hasJackTrump = true;
        }
        return hasAceTrump && hasJackTrump;
    }

}
