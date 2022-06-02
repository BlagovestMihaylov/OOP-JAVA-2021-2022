package second;

import first.A;

public class B
{
    protected static class C implements A
    {

        @Override
        public void method()
        {
            System.out.println("C implementation ");
        }
    }

    public A getA()
    {
        return new C();
    }

}
