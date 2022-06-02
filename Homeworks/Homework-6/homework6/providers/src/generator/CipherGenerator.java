package generator;

import interfaces.Cipherable;

import java.util.ArrayList;
import java.util.List;

public class CipherGenerator {
    static Result countDistinct(Cipherable cipher, int seed) {
        char[] array = cipher.getSecretChars(seed);
        int[] counts = new int['Z' - 'A' + 1];
        for (char c : array) {
            counts[c - 'A'] += 1;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 1) {
                list.add((char) (i + 'A'));
            }
        }

        return new Result(
                list.toString().substring(1, list.toString().length() - 1)
                        .replaceAll(" ", "")
                        .toCharArray(),
                list.size());

    }
}
