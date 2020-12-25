package ru.vsu.kudinov;

import ru.vsu.kudinov.utils.FileUtils;

public class Main
{
    public static void main(String[] args)
    {
        int[][] inputArray = FileUtils.readIntArray2FromFile(args[0]);
        assert inputArray != null;
        
        int[][] sortedArr = CreateNewArray.createNewArray(inputArray);

        FileUtils.writeIntArray2ToFile(sortedArr, args[1]);
    }
}