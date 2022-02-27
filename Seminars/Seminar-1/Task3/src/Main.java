import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Encrypt eObj = new Encrypt();
        Decrypt dObj = new Decrypt();
        System.out.println("Number before the encyption: \t" + num);
        eObj.setNum(num);
        eObj.encrypt();
        System.out.print("Number after encryption:\t\t");
        eObj.print();
        dObj.setNum(eObj.returnNum());
        dObj.decrypt();
        System.out.print("Number after decryption:\t\t");
        dObj.print();
    }
}
