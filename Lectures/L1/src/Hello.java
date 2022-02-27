import java.util.Scanner;


public class Hello
{
    static String s1 = "12345";
    static String s2 = "4321"; //must be static

    public static void main(String[] args)
    {

        final int min = 123; //const
        //constant int min2 = 123; // there is no such thing
        int num = 12345; //can be not static
        System.out.println("Hello Java");
        System.out.println(s1 + s2);
        System.out.println(num);


        //Arithmetics
        double a = 7, b = 5;
        System.out.println(7 / 5);
        System.out.println(7 % 5);
        System.out.println(a / b);

        //if
        if (a > b) System.out.println(a);


    }
}
