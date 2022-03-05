package shape;

public class RectangleTest
{
    public static void main(String[] args) throws Exception
    {
        Rectangle rec = new Rectangle(3,4);
        System.out.printf("Width: %.2f\n", rec.getWidth());
        System.out.printf("Height: %.2f\n", rec.getHeight());
        System.out.printf("Color: %s\n", rec.getColor());
        System.out.printf("Area: %.2f\n", rec.getArea());
        System.out.printf("Perimeter: %.2f\n", rec.getPerimeter());
    }
}
