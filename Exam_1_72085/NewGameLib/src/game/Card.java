package game;

public class Card
{

    private String face;
    private String suit;

    public Card(final String face, final String suit)
    {
        this.setFace(face);
        this.setSuit(suit);
    }

    public String getFace()
    {
        return face;
    }

    public String getSuit()
    {
        return suit;
    }

    public void setFace(final String face)
    {
        if (face == null)
        {
            throw new IllegalArgumentException("Face cannot be null");
        }

        for (Face f : Face.values())
        {
            if (!f.toString().equals(face))
            {
                throw new IllegalArgumentException("Invalid face");
            }
        }

        this.face = face;
    }

    public void setSuit(final String suit)
    {
        if (suit == null)
        {
            throw new IllegalArgumentException("Suit cannot be null");
        }

        for (Suit s : Suit.values())
        {
            if (!s.toString().equals(suit))
            {
                throw new IllegalArgumentException("Invalid suit");
            }
        }

        this.suit = suit;
    }

    @Override
    public String toString()
    {
        return String.format("%s of %s", face, suit);
    }

}




