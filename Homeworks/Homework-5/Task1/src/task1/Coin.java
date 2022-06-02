package task1;

import java.util.Random;

public class Coin
{
    private java.util.Random rand;
    private Face face;

    public Coin(Face face)
    {
        setFace(face);
        rand = new Random();
    }

    public void setFace(Face face)
    {
        this.face = face;
    }

    public void flip()
    {
        int i = rand.nextInt(2) + 1;
        if(i == 1) face = Face.HEADS;
        else face = Face.TAILS;
    }

    public Face getFace()
    {
        return face;
    }

    public boolean isHeads()
    {
        return face == Face.TAILS;
    }

    public String toString()
    {
        return face.toString();
    }
}
