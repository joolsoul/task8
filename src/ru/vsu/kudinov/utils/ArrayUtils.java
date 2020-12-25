package ru.vsu.kudinov.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayUtils
{

    public static int[] toPrimitive(Integer[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {

            result[i] = arr[i];
        }
        return result;
    }

    public static int[] toIntArray(String str)
    {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[0]);
        return ArrayUtils.toPrimitive(arr);
    }

    public static String toString(int[] arr, String itemFormat)
    {
        if (arr == null)
        {
            return null;
        }
        if (itemFormat == null || itemFormat.length() == 0)
        {
            itemFormat = "%s";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
        {
            if (i > 0)
            {
                sb.append(", ");
            }
            sb.append(String.format(Locale.ROOT, itemFormat, arr[i]));
        }
        return sb.toString();
    }

    public static int[][] toIntArray2(String[] lines)
    {
        int[][] arr2 = new int[lines.length][];
        for (int r = 0; r < lines.length; r++)
        {
            arr2[r] = toIntArray(lines[r]);
        }
        return arr2;
    }


    public static String toString(int[][] arr2, String itemFormat)
    {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < arr2.length; r++)
        {
            if (r > 0)
            {
                sb.append(System.lineSeparator());
            }
            sb.append(toString(arr2[r], itemFormat));
        }
        return sb.toString();
    }

    public static String[] readLinesFromFile(String fileName) throws FileNotFoundException
    {
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8"))
        {
            lines = new ArrayList<>();
            while (scanner.hasNext())
            {
                lines.add(scanner.nextLine());
            }

        }
        return lines.toArray(new String[0]);
    }


    public static void writeArrayToFile(String fileName, int[][] arr2, String itemFormat)
            throws FileNotFoundException
    {
        try (PrintWriter out = new PrintWriter(fileName))
        {
            out.println(toString(arr2, itemFormat));
        }
    }

    public static void writeIntArrayToFile(String fileName, int[][] arr2)
            throws FileNotFoundException
    {
        writeArrayToFile(fileName, arr2, null);
    }
}





