import generator.Wrapper;
import interfaces.Cipherable;

public class Main
{
    public static void main(String[] args)
    {
        Wrapper wrapper = new Wrapper(15);
        Cipherable cipherable = wrapper.makeFixedRandom();
        System.out.println(cipherable.getSecretChars(123));
    }
}
