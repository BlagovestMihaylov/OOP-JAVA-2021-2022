package fmi.poop.homework3.hamming;

import java.util.Scanner;

public class HammingDistance
{
    static int hammingDist(String str1, String str2)
    {

        int i = 0, count = 0;
        while (i < str1.length())
        {
            if (str1.charAt(i) != str2.charAt(i))
            {
                count++;
            }
            i++;
        }
        return count;
    }
    static String hammingDistPos(String str1, String str2)
    {
        String temp = "";
        int i = 0, count = 0;
        while (i < str1.length())
        {
            if (str1.charAt(i) != str2.charAt(i))
            {
                count++;
                temp+= i;
            }
            i++;
        }
        return temp;
    }

    static int sumOfStringLetters(String str)
    {
        int sum = 0;
        for (int i = 0; i < str.length(); ++i)
        {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

    static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    static String attach(String str, boolean isEven)
    {
        if (isEven) str += '1';
        else str += '0';
        return str;
    }

    static void printPositions(String str)
    {
        if(str.length() == 0) System.out.println("There is no difference!");
        else if(str.length() == 1) System.out.println("The only difference is on position ");
        else System.out.println("The differences are on positions ");
        for(int i =0; i<str.length(); ++i)
        {
            if(i<str.length()-1)
            System.out.print(i + ", ");
            else System.out.println(i);

            if(i == str.length() -2) System.out.print("and ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.length() < 8 && str2.length() < 8)
        {
            str1 = attach(str1, isEven(sumOfStringLetters(str1)));
            str2 = attach(str2, isEven(sumOfStringLetters(str2)));
        }


        System.out.println(str1);
        System.out.println(str2);

        System.out.printf("Hamming distance between %s and %s is %d\n", str1, str2, hammingDist(str1, str2));
        printPositions(hammingDistPos(str1,str2));
    }
}
