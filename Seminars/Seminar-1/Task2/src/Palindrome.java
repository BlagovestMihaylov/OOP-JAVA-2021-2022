import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Palindrome
{
    static boolean is5Digit(int num)
    {
        if (num / 1000 >= 10 || num / 10000 < 10)
            return true;
        else return false;
    }

    static boolean isPalindrome(@NotNull String s1, @NotNull String s2)
    {
        if (s1.equals(s2)) return true;
        else return false;
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (!is5Digit(num)) System.out.println("Not a five digit number");
        int orignalNumber = num;
        String strNum = String.valueOf(num);
        char ch;
        String reverseNumber = "";
        for (int i = 0; i < strNum.length(); i++)
        {
            ch = strNum.charAt(i);
            reverseNumber = ch + reverseNumber;
        }

        // System.out.println(strNum);
        //System.out.println(reverseNumber);
        if (isPalindrome(reverseNumber, strNum)) System.out.println("YES");
        else System.out.println("NO");
    }
}
