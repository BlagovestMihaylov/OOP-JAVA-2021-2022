package homework2.task3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class RandomNumbers
{
    static int drawRandomNumber()
    {
        Random rand = new Random();
        if (rand.ints(1, 101).findFirst().getAsInt() <= 20)
            return 1;
        else if (rand.ints(1, 101).findFirst().getAsInt() > 20
                && rand.ints(1, 101).findFirst().getAsInt() <= 50)
            return 2;
        else return 3;

    }

    public static void main(String[] args)
    {
        int counterOne = 0, counterTwo = 0, counterThree = 0, times = 10000;
        for (int i = 0; i < times; i++)
        {
            if (drawRandomNumber() == 1) counterOne++;
            else if (drawRandomNumber() == 2) counterTwo++;
            else counterThree++;
        }

        double p1 = (double) counterOne / (double) times * 100,
                p2 = (double) counterTwo / (double) times * 100,
                p3 = (double) counterThree / (double) times * 100;


        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        String str = "Probability for 1 is " + nf.format(p1) +"%";
        System.out.println(str);
        String str2 = "Probability for 2 is " + nf.format(p2) +"%";
        System.out.println(str2);
        String str3 = "Probability for 3 is " + nf.format(p3) +"%";
        System.out.println(str3);
    }
}
