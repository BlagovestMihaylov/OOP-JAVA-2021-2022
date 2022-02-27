public class Decrypt
{
    private static int num;

    public  void setNum(int number)
    {
        num = number;
    }
    private int change(int number)
    {
        return (num+3)%10;
    }

    public  void decrypt()
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
}
