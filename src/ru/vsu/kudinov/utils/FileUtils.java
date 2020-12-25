package ru.vsu.kudinov.utils;

import java.io.FileNotFoundException;

public class FileUtils
{
    public static int[][] readIntArray2FromFile(String fileName)
    {
        try
        {
            return ArrayUtils.toIntArray2(ArrayUtils.readLinesFromFile(fileName));
        }
        catch (FileNotFoundException e)
        {
            return null;
        }
    }

    public static void writeIntArray2ToFile(int[][] outputArray, String fileName)
    {
        try
        {
            ArrayUtils.writeIntArrayToFile(fileName, outputArray);
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("File not found");
        }
    }
}
