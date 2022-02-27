import java.util.Scanner;

public class CF
{
    static double celsiusToFahrenheit(double C)
    {
        return 9.0 / 5.0 * C + 32;
    }

    static double fahrenheitToCelsius(double F)
    {
        return 5.0 / 9.0 * (F - 32);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want ot convert?");
        System.out.println("Select F(1) or C(2)");
        int i = input.nextInt();

        if (i == 1)
        {
            System.out.println("Converting F to C");
            double num = input.nextDouble();
            System.out.println(fahrenheitToCelsius(num));
        } else if (i == 2)
        {
            System.out.println("Converting C to F");
            double num = input.nextDouble();
            System.out.println(celsiusToFahrenheit(num));
        } else System.out.println("Nothing selected.");
    }

}
