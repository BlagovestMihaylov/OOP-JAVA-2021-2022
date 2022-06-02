package Cipher;

public class RouteCipher
{
    private int key;

    public RouteCipher(int key)
    {
        setKey(key);
    }

    public int getKey()
    {
        return this.key;
    }

    public void setKey(int key)
    {
        if (key == 0) throw new RuntimeException("Key cannot be 0");
        this.key = key;
    }

    public String encrypt(String plainText)
    {
        boolean negative;
        if (key < 0)
        {
            key = -key;
            negative = true;
        } else
        {
            negative = false;
        }
        char temp[] = plainText.toCharArray();
        int numberOfRows = exactDivision(temp.length, key);
        char Matrix[][] = new char[numberOfRows][key];
        int matrixSize = numberOfRows * key;
        int pos = 0;
        for (int i = 0; i < numberOfRows; i++)
        {
            for (int j = 0; j < key; j++)
            {
                if (pos < temp.length)
                {
                    Matrix[i][j] = temp[pos];
                } else
                {
                    Matrix[i][j] = 'X';
                }
                pos++;
            }
        }

        char outputChar[] = new char[matrixSize + 1];
        int poss = 0;
        for (int i = 0; i < numberOfRows; i++)
        {
            for (int j = 0; j < key; j++)
            {
                System.out.print(Matrix[i][j] + "  ");

            }
            System.out.println();
        }

        int counter = 0;
        int startRow = 0;
        int startColumn = 0;
        if (!negative)
        {

            while (startColumn < key && startRow < numberOfRows)
            {
                if (counter == matrixSize) break;

                for (int i = startRow; i < numberOfRows; i++)
                {
                    outputChar[counter] = Matrix[i][startColumn];
                    counter++;
                }
                startColumn++;

                if (counter == matrixSize) break;

                for (int i = startColumn; i < key; i++)
                {
                    outputChar[counter] = Matrix[numberOfRows - 1][i];
                    counter++;
                }
                numberOfRows--;

                if (counter == matrixSize) break;

                if (startRow < numberOfRows)
                {
                    for (int i = numberOfRows - 1; i > startRow; i--)
                    {
                        outputChar[counter] = Matrix[i][key - 1];
                        counter++;
                    }
                    key--;
                }

                if (counter == matrixSize) break;


                if (startColumn < key)
                {
                    for (int i = key; i >= startColumn; i--)
                    {
                        outputChar[counter] = Matrix[startRow][i];
                        counter++;
                    }
                    startRow++;
                }

                if (counter == matrixSize) break;
            }

        } else
        {

            while (startColumn < key && startRow < numberOfRows)
            {
                if (counter == matrixSize) break;

                if (startRow < numberOfRows)
                {
                    for (int i = numberOfRows - 1; i >= startRow; i--)
                    {
                        outputChar[counter] = Matrix[i][key - 1];
                        counter++;
                    }
                    key--;
                }
                if (counter == matrixSize) break;

                for (int i = key; i > startRow; i--)
                {
                    outputChar[counter] = Matrix[startRow][i - 1];
                    counter++;
                }
                startRow++;
                if (counter == matrixSize) break;

                for (int i = startRow; i < numberOfRows; i++)
                {
                    outputChar[counter] = Matrix[i][startColumn];
                    counter++;
                }
                startColumn++;

                if (counter == matrixSize) break;

                if (startColumn < key)
                {
                    for (int i = startColumn; i < key; i++)
                    {
                        outputChar[counter] = Matrix[numberOfRows - 1][i];
                        counter++;
                    }
                    numberOfRows--;
                }
                if (counter == matrixSize) break;
            }
        }


        String outputString = new String(outputChar);
        String str = outputString.substring(0, outputString.length() - 1);

        return str;
    }

    public String decrypt(String cipherText)
    {
        boolean negative;
        if (key < 0)
        {
            key = -key;
            negative = true;
        } else
        {
            negative = false;
        }
        char temp[] = cipherText.toCharArray();
        int numberOfRows = exactDivision(temp.length, key);
        char Matrix[][] = new char[numberOfRows][key];
        int matrixSize = numberOfRows * key;



        int poss = 0;
        int temp1 = key;
        int temp2 = numberOfRows;
        int counter = 0;
        int startRow = 0;
        int startColumn = 0;
        if (!negative)
        {

            while (startColumn < key && startRow < numberOfRows)
            {
                if (counter == matrixSize) break;

                for (int i = startRow; i < numberOfRows; i++)
                {
                    Matrix[i][startColumn] = temp[counter];
                    counter++;
                }
                startColumn++;

                if (counter == matrixSize) break;

                for (int i = startColumn; i < key; i++)
                {
                    Matrix[numberOfRows - 1][i] = temp[counter];
                    counter++;
                }
                numberOfRows--;

                if (counter == matrixSize) break;

                if (startRow <= numberOfRows)
                {
                    for (int i = numberOfRows - 1; i > startRow; i--)
                    {
                        Matrix[i][key - 1] = temp[counter];
                        counter++;
                    }
                    key--;
                }

                if (counter == matrixSize) break;


                if (startColumn <= key)
                {
                    for (int i = key; i >= startColumn; i--)
                    {
                        Matrix[startRow][i] = temp[counter];
                        counter++;
                    }
                    startRow++;
                }

                if (counter == matrixSize) break;
            }

        } else
        {

            while (startColumn < key && startRow < numberOfRows)
            {
                if (counter == matrixSize) break;

                if (startRow <= numberOfRows)
                {
                    for (int i = numberOfRows - 1; i >= startRow; i--)
                    {
                        Matrix[i][key - 1] = temp[counter];
                        counter++;
                    }
                    key--;
                }
                if (counter == matrixSize) break;

                for (int i = key; i > startRow; i--)
                {
                    Matrix[startRow][i - 1] = temp[counter];
                    counter++;
                }
                startRow++;
                if (counter == matrixSize) break;

                for (int i = startRow; i < numberOfRows; i++)
                {
                    Matrix[i][startColumn] = temp[counter];
                    counter++;
                }
                startColumn++;

                if (counter == matrixSize) break;

                if (startColumn <= key)
                {
                    for (int i = startColumn; i < key; i++)
                    {
                        Matrix[numberOfRows - 1][i] = temp[counter];
                        counter++;
                    }
                    numberOfRows--;
                }
                if (counter == matrixSize) break;
            }
        }

        char outputChar[] = new char[matrixSize + 1];
        int cnt = 0;

        int pos = 0;
        for (int i = 0; i < temp2; i++)
        {
            for (int j = 0; j < temp1; j++)
            {
                if(pos == temp1*temp2 - cnt) break;
                System.out.print(Matrix[i][j] + "  ");
                outputChar[pos] = Matrix[i][j];
                pos++;

            }
            System.out.println();
        }

        int tempSize = matrixSize;
        while (outputChar[tempSize-1] == 'X' && cnt < temp1 - 1)
        {
            tempSize --;
            cnt++;
        }
        char tempChar[] = new char[matrixSize - cnt];
        for(int i = 0; i < matrixSize -cnt; i++)
        {
            tempChar[i] = outputChar[i];
        }
        String outputString = new String(tempChar);
//        String str = outputString.substring(0, outputString.length()-cnt);
        return outputString;


    }

    public String toString()
    {
        return null;
    }


    private int exactDivision(int a, int b)
    {
        if (a % b == 0) return a / b;
        else return a / b + 1;
    }


}
