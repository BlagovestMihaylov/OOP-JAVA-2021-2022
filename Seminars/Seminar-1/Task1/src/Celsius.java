
import java.util.Scanner;

public class Celsius
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double F = input.nextDouble();
        double C = 5.0 / 9.0 * (F - 32);
        System.out.println(C);
    }
}
