package zad3a;

public class TestOuterInnerLab3b
{
    public static void main(String[] args)
    {
        OuterClassA outerClassA = new OuterClassA();
        OuterClassB outerClassB = new OuterClassB();
        OuterClassA.InnerClassA innerClassA = outerClassA.getInnerClass("NAME");
        OuterClassB.InnerCLassB innerCLassB = outerClassB.getInnerClassB(outerClassA, "NAME2");
        System.out.println(outerClassA);
        System.out.println(outerClassB);
        System.out.println(innerClassA.toString());
        System.out.println(innerCLassB.toString());
    }
}
