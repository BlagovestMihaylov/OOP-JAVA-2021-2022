package fmi.poop.homework4.squareMatrix;

import java.util.Vector;

public class SquareMatrix
{
    private byte[][] dataArray;
    private byte x, y, columns, rows;
    private Vector<Integer> xVec = new Vector<>(), yVec = new Vector<>();


    public SquareMatrix()
    {

        this.dataArray = new byte[0][0];
        this.x = 0;
        this.y = 0;
        this.columns = 0;
        this.rows = 0;

    }

    public SquareMatrix(SquareMatrix sm)
    {
        this(sm.dataArray, sm.x, sm.y, sm.columns, sm.rows);
    }

    public SquareMatrix(byte[][] dataArray)
    {
        this(dataArray, (byte) 0, (byte) 0, (byte) dataArray.length, (byte) dataArray[0].length);
    }


    private SquareMatrix(byte[][] dataArray, byte x, byte y, byte columns, byte rows)
    {
        this.dataArray = dataArray;
        this.x = x;
        this.y = y;
        this.columns = columns;
        this.rows = rows;
    }

    private SquareMatrix getSubMatrix(byte x, byte y, byte columns, byte rows)
    {
        return new SquareMatrix(dataArray, (byte) (this.x + x), (byte) (this.y + y), columns, rows);
    }

    private int sumOfMatrix2x2(SquareMatrix matrix, int i, int j)
    {
        return matrix.dataArray[i][j] + matrix.dataArray[i][j+1] + matrix.dataArray[i+1][0] + matrix.dataArray[i+1][j +1];
    }

    public int findMaxSum()
    {
        int sum = 0;
        int candidateSum = 0;
        for (byte i = 0; i < columns - 1; ++i)
        {
            for (byte j = 0; j < rows - 1; ++j)
            {
               candidateSum = dataArray[i][j]  + dataArray[i][j+1] + dataArray[i+1][j] + dataArray[i+1][j +1];
               if(sum < candidateSum)
               {
                   sum = candidateSum;
                   xVec.clear();
                   yVec.clear();
                   xVec.add((int) i);
                   yVec.add((int) j);
               }
               else if(sum == candidateSum)
               {
                   xVec.add((int) i);
                   yVec.add((int) j);
               }

            }
        }
        return sum;
    }

    public void printAll()
    {
        System.out.printf("Biggest sum of 2x2 submatrix: %d\n", findMaxSum());
        System.out.println("Starting indexes of the submatrixes:");
        for(int i=0; i <xVec.size(); ++i)
        {
            System.out.println("[" + xVec.get(i) + ", " + yVec.get(i) + "]");
        }
    }

    @Override
    public String toString()
    {

        StringBuffer sb = new StringBuffer();

        for (int i = y; i < x + rows; i++)
        {
            for (int j = x; j < x + columns; j++)
            {
                sb.append(dataArray[i][j]).append(" ");
            }

            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);

        return sb.toString();
    }

}
