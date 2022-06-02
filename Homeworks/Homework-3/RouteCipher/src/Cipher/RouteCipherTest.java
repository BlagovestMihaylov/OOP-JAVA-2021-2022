package Cipher;

public class RouteCipherTest
{
    public static void main(String[] args)
    {
        System.out.println("ENCRYPT");
        RouteCipher c = new RouteCipher(-5);
        System.out.println("KEY: -5");

        System.out.println(c.encrypt("ABORTTHEMISSIONYOUHAVEBEENSPOTTED"));
        System.out.println("XTEANITROBATSYVNTEDXOEHOMEHSOESPBUI – the right\n");

        c.setKey(5);
        System.out.println("KEY: 5");
        System.out.println(c.encrypt("ABORTTHEMISSIONYOUHAVEBEENSPOTTED"));
        System.out.println("ATSYVNTEDXXTEANITROBHSOESPOEHOMEIUB - the right\n");

        System.out.println("DECRYPT");
        c.setKey(4);
        System.out.println("KEY: 4");
        System.out.println("TIEIXTXXEAHSIHSPNTLT");
        System.out.println(c.decrypt("TIEIXTXXEAHSIHSPNTLT"));
        System.out.println("THISISTHEPLAINTEXT - the right");
    }
}
