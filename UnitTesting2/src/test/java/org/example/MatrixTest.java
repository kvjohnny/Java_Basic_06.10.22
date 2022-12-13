package org.example;

import org.junit.Assert;
import org.junit.Test;

/*
* В отличие от программы, которая находится в папке "UnitTesting",
* добавил два тестовых метода на проверку матриц, которые имеют размеры 1х1
* и 1х0. Также, в консоль выводятся результаты выполнения всех тестовых методов.
*/

public class MatrixTest {
    Matrix matrix1 = new Matrix();

    @Test
    public void calculateAveragePositiveNumbers() {
        int[] arr = {4, 2, 3, 1};
        double expectedAverage = 2.5;
        double actualAverage = matrix1.calculateAverage(arr);
        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void calculateAverageNegativeNumbers() {
        int[] arr = {-3, -1, -5, -2, -4, -1};
        double expectedAverage = -2.6666666;
        double actualAverage = matrix1.calculateAverage(arr);
        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void calculateAveragePositiveAndNegativeNumbers() {
        int[] arr = {-3, 6, -2, -8, 4};
        double expectedAverage = -0.6;
        double actualAverage = matrix1.calculateAverage(arr);
        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void calculateAverageZeroNumbers() {
        int[] arr = {0, 0, 0};
        double expectedAverage = 0.0;
        double actualAverage = matrix1.calculateAverage(arr);
        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void calculateAverageOneNumber() {
        int[] arr = {7};
        double expectedAverage = 7.0;
        double actualAverage = matrix1.calculateAverage(arr);
        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void calculateAverageNoNumbers() {
        int[] arr = {};
        double expectedAverage = Double.NaN;
        double actualAverage = matrix1.calculateAverage(arr);
        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void isMatrixSquareTrueResult() {
        int[][] array = new int[5][5];
        int expectedIsMatrixSquare = 1;
        int actualIsMatrixSquare = matrix1.isMatrixSquare(array);
        Assert.assertEquals(expectedIsMatrixSquare, actualIsMatrixSquare);
    }

    @Test
    public void isMatrixSquareFalseResult() {
        int[][] array = new int[3][8];
        int expectedIsMatrixSquare = 0;
        int actualIsMatrixSquare = matrix1.isMatrixSquare(array);
        Assert.assertEquals(expectedIsMatrixSquare, actualIsMatrixSquare);
    }

    @Test
    public void isMatrixSquareWithDoubleOneFalseResult() {
        int[][] array = new int[1][1];
        int expectedIsMatrixSquare = 0;
        int actualIsMatrixSquare = matrix1.isMatrixSquare(array);
        Assert.assertEquals(expectedIsMatrixSquare, actualIsMatrixSquare);
    }

    @Test
    public void isMatrixSquareWithZeroFalseResult() {
        int[][] array = new int[1][0];
        int expectedIsMatrixSquare = 0;
        int actualIsMatrixSquare = matrix1.isMatrixSquare(array);
        Assert.assertEquals(expectedIsMatrixSquare, actualIsMatrixSquare);
    }
}