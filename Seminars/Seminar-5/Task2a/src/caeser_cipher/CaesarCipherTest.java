package caeser_cipher;

import java.util.Scanner;

public class CaesarCipherTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CaesarCipher caeserCipher = new CaesarCipher();

        System.out.print("1.Encrypt\n2.Decrypt\nEnter choice:  ");
        int choice = input.nextInt();
        input.nextLine();


        if(choice == 1)
        {
            System.out.print("Enter a word: ");
            String plaintext = input. nextLine();
            System.out.print("Encrypted text: " + caeserCipher.encrypt(plaintext) );
        }
        else if(choice == 2)
        {
            System.out.print("Enter a word'");
            String plaintext = input. nextLine();
            System.out.print("Encrypted text: " + caeserCipher.decrypt(plaintext) );
        }
    }
}
