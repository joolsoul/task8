package ru.vsu.kudinov.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.kudinov.CreateNewArray;

public class Tests
{
    @Test
    public void test1()
    {
        int[][] inputArray1 = {{4, 4, 4, 4}, {9, 8, 8, 7}, {9, 7, 5, 3}, {8, 2, 2, 7}};
        int[][] expectedArray = CreateNewArray.createNewArray(inputArray1);
        int[][] actualArray = {{1, 2, 2, 1}, {1, 1, 1, 0}, {1, 0, 0, 0}, {0, 1, 1, 0}};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void test2()
    {
        int[][] inputArray2 = {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int[][] expectedArray = CreateNewArray.createNewArray(inputArray2);
        int[][] actualArray = {{1, 2, 2, 1}, {1, 2, 2, 1}, {1, 2, 2, 1}, {1, 2, 2, 1}};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void test3()
    {
        int[][] inputArray3 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] expectedArray = CreateNewArray.createNewArray(inputArray3);
        int[][] actualArray = {{1, 1, 1, 1}, {2, 2, 2, 2}, {2, 2, 2, 2}, {1, 1, 1, 1}};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void test4()
    {
        int[][] inputArray4 = {{1, 0, 1, 0}, {1, 0, 0, 1}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] expectedArray = CreateNewArray.createNewArray(inputArray4);
        int[][] actualArray = {{1, 1, 0, 0}, {2, 2, 1, 0}, {2, 1, 1, 1}, {1, 1, 1, 1}};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void test5()
    {
        int[][] inputArray5 = {{5, 5, 5, 5}, {5, 5, 5, 5}, {5, 5, 5, 5}, {5, 5, 5, 5}};
        int[][] expectedArray = CreateNewArray.createNewArray(inputArray5);
        int[][] actualArray = {{2, 3, 3, 2}, {3, 4, 4, 3}, {3, 4, 4, 3}, {2, 3, 3, 2}};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }


}

