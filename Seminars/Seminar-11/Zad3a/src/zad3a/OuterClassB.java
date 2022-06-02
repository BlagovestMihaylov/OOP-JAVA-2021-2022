package zad3a;

public class OuterClassB
{

   public static class InnerCLassB extends OuterClassA.InnerClassA
    {
        public InnerCLassB()
        {
            super("UNKNOWN");
        }

        public InnerCLassB(String name)
        {
            super(name);
        }

        @Override
        public String toString()
        {
            return "InnerCLassB{}" + getName();
        }
    }

    public InnerCLassB getInnerClassB(OuterClassA a, String s)
    {
        return new InnerCLassB(s);
    }

    @Override
    public String toString()
    {
        return "OuterClassB{}";
    }
}
