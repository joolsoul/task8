package ru.vsu.kudinov;

public class CreateNewArray
{
    public static int[][] createNewArray(int[][] array)
    {
        int[][] resultArray = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                int counter =  countsEqualsNeighbors(i, j, array);
                resultArray[i][j] = counter;
            }
        }
        return resultArray;
    }

    private static int countsEqualsNeighbors(int i, int j, int[][] array)
    {
        int counter = 0;
        if(i != array.length - 1 && array[i][j] == array[i+1][j])
        {
            counter++;
        }

        if(i != 0 && array[i][j] == array[i-1][j])
        {
            counter++;
        }

        if(j != array.length - 1 && array[i][j] == array[i][j+1])
        {
            counter++;
        }

        if(j != 0 && array[i][j] == array[i][j-1])
        {
            counter++;
        }
        return counter;
    }
}
