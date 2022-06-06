package generator;


import interfaces.Cipherable;

import java.util.ArrayList;
import java.util.List;

public class CipherGenerator
{
    public static Result countDistinct(Cipherable cipher, int seed)
    {
        char[] array = cipher.getSecretChars(seed);
        int[] counts = new int['Z' - 'A' + 1];
        for (char c : array)
        {
            counts[c - 'A'] += 1;
        }
        int size = 0;

        for (int count : counts)
        {
            if (count == 1)
            {
                size++;
            }

        }

        return new Result(array, size);

    }
}
