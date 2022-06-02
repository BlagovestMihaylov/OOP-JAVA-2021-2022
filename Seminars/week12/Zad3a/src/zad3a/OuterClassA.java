package zad3a;

public class OuterClassA
{
    public static class InnerClassA
    {
        private String name;

        public InnerClassA(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "InnerClassA{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public InnerClassA getInnerClass(String s)
    {
        return new InnerClassA(s);
    }


    @Override
    public String toString()
    {
        return "OuterClassA{}";
    }
}
