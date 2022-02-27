import java.util.Scanner;

public class fahrenheit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double C = input.nextDouble();
        double F = 9.0 / 5.0 * C + 32;
        System.out.println(F);
    }
}
