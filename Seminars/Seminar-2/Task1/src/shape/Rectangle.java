package shape;

public class Rectangle
{
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height) throws Exception
    {
        setWidth(width);
        setHeigh(height);
        color = "RED";
    }

    public Rectangle()
    {
        height = 0;
        width = 0;
        color = "RED";
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeigh(double newHeight) throws Exception
    {
        if (newHeight >= 0) height = newHeight;
        else throw new Exception("Negative number");
    }

    public void setWidth(double newWidth) throws Exception
    {
        if (newWidth >= 0) width = newWidth;
        else throw new Exception("Negative number");
    }

    public void setColor(String newColor) throws Exception
    {
        if(newColor != null) newColor = color;
        else throw new Exception("Null Color");
    }

    public String getColor()
    {
        return color;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (height + width);
    }
}
