import java.util.Scanner;
//import java.lang.String;

public class ACGT
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int A = 0, C = 0, G = 0, T = 0;
        int num = input.nextInt();
        String strNum = "";
        while(num != 0)
        {
            strNum += num%4;
            num = num/4;
        }

        char[] strNumArr = strNum.toCharArray();
        for(int i =0; i<strNum.length(); i++)
        {
            if(strNumArr[i] == '0') strNumArr[i] = 'A';
            if(strNumArr[i] == '1') strNumArr[i] = 'C';
            if(strNumArr[i] == '2') strNumArr[i] = 'G';
            if(strNumArr[i] == '3') strNumArr[i] = 'T';
        }
        strNum = String.valueOf(strNumArr);
        char ch;
        String reverseNumber = "";
        for (int i = 0; i < strNum.length(); i++)
        {
            ch = strNum.charAt(i);
            reverseNumber = ch + reverseNumber;
        }
        System.out.println(reverseNumber);

    }
}
