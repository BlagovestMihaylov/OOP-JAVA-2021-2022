package task1;

public enum Face
{
    HEADS("heads"),
    TAILS("tails");

    private String face;

    Face(String face)
    {
        this.face = face;
    }

    @Override
    public String toString()
    {
        return face;
    }
}
