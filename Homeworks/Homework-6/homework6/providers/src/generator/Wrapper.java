package generator;

import interfaces.Cipherable;

import java.util.Random;

public class Wrapper {
    int size;

    public Wrapper() {
    }

    public Wrapper(int size) {
        this.size = size;
    }


    public Cipherable makeFixedRandom() {
        FixedRandom fixedRandom = new FixedRandom();
        return new Cipherable() {
            @Override
            public char[] getSecretChars(int seed) {
                return fixedRandom.getSecretChars(seed);

            }
        };
    }

    public Cipherable makeFixedSelection() {
        FixedSelection fixedSelection = new FixedSelection();
        return new Cipherable() {
            @Override
            public char[] getSecretChars(int seed) {
                return fixedSelection.getSecretChars(seed);
            }
        };
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    class FixedRandom implements Cipherable {

        public FixedRandom() {
        }

        @Override
        public char[] getSecretChars(int seed) {
            Random random = new Random(seed);
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = (char) (random.nextInt('Z' - 'A') + 'A');
            }
            return array;
        }

    }

    class FixedSelection implements Cipherable {
        Random random;

        public FixedSelection() {
        }

        @Override
        public char[] getSecretChars(int seed) {
            random = new Random(seed);
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = (char) (random.nextInt('Z' - 'A') + 'A');
            }
            return array;
        }
    }
}
