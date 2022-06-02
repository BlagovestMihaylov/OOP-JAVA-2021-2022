package game;

public enum Face
{
    ACE("Ace"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");


    private final String face;

    Face(String face)
    {
        this.face = face;
    }



    public String toString()
    {
        return face;
    }

}
