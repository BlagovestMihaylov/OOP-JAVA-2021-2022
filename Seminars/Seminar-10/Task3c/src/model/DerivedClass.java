package model;

public class DerivedClass extends BaseClass
{
    public void method()
    {
        System.out.println("Hello");
    }

    public static void callMethodFromBase(BaseClass baseClass)
    {
        DerivedClass derivedClass = (DerivedClass) baseClass;
        derivedClass.method();
    }

}
