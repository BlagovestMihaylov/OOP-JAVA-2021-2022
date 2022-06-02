package fmi.poop.homework4.squareMatrix;

import java.util.Random;

public class SquareMatrixTest
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumberColRows = random.ints(2, 13).findFirst().getAsInt();
       // int randomNumberColRows = 4;
        int randomValue;
        byte[][] testArray = new byte[randomNumberColRows][randomNumberColRows];

        for (int i = 0; i < randomNumberColRows; ++i)
        {
            for (int j = 0; j < randomNumberColRows; ++j)
            {
                randomValue = random.ints(0, 9)
                                    .findFirst()
                                    .getAsInt();
                testArray[i][j] = (byte) randomValue;
            }
        }

        SquareMatrix sm = new SquareMatrix(testArray);
        System.out.println(sm.toString());
        sm.printAll();

    }
}
