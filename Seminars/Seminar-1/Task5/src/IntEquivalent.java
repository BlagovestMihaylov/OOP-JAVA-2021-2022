import java.util.Scanner;

public class IntEquivalent
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        //String s = "A B C a b c 0 1 2 $ * + / ";
        char [] sArr = s.toCharArray();
        for(int i = 0; i<s.length(); i++)
        {
            System.out.print((int) sArr[i] + " ");
        }
    }
}
