package task1;

public class MonetaryCoinTest
{
    public static void main(String[] args)
    {
        MonetaryCoin monetaryCoin = new MonetaryCoin(Face.HEADS);
        monetaryCoin.flip();
        MonetaryCoin monetaryCoin1 = new MonetaryCoin(Face.HEADS);
        monetaryCoin1.flip();
        MonetaryCoin monetaryCoin2 = new MonetaryCoin(Face.HEADS);
        monetaryCoin2.flip();
        MonetaryCoin monetaryCoin3 = new MonetaryCoin(Face.HEADS);
        monetaryCoin3.flip();


        System.out.println(monetaryCoin.getValue());
        System.out.println(monetaryCoin1.getValue());
        System.out.println(monetaryCoin2.getValue());
        System.out.println(monetaryCoin3.getValue());
    }
}
