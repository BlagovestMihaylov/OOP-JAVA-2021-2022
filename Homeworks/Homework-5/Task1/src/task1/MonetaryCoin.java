package task1;

public class MonetaryCoin extends Coin
{
    private int value;

    public int getValue()
    {
        if(super.getFace() == Face.HEADS) value = 0;
        else value = 1;
        return value;
    }

    public MonetaryCoin(Face face)
    {
        super(face);
    }
}
