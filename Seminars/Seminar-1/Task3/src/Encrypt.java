import java.util.Scanner;

public class Encrypt
{
    private int num;
    private Scanner input = new Scanner(System.in);


    public void setNum()
    {
        while (!Is4Digit())
        {
            num = input.nextInt();
        }
    }

    public void setNum(int number)
    {
        num = number;
    }


    private boolean Is4Digit()
    {
        if (num / 100 >= 10 || num / 1000 < 10)
            return true;
        else return false;
    }

    private int change(int number)
    {
        return (number + 7) % 10;
    }

    public void encrypt()
    {
        int fourth = change(num%10);
        num /= 10;
        int third = change(num%10);
        num /= 10;
        int second = change(num%10);
        num /= 10;
        int first = change(num%10);

        num = 1000 * third + 100 * fourth + 10 * first + second;
    }

    public void print()
    {
        System.out.println(num);
    }

    public int returnNum()
    {
        return num;
    }


}
