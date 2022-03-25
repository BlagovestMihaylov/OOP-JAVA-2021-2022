package fmi.aoop.lecture3;

public class ProductTest
{
    public static void main(String[] args)
    {
        Product p = new Product("Hello", 123);
        System.out.println(p);
        Product p2 = new Product("Hello", 1231);
        System.out.println(p2);
    }
}
