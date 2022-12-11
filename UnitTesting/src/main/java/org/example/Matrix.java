package org.example;

import java.util.Arrays;

public class Matrix {
    double sum = 0.0;
    double average;

    double calculateAverage(int[] arr) {
        for (int number : arr) {
            sum += number;
        }
        average = sum / arr.length;
        System.out.println("Среднее арифметическое элементов массива "
                + Arrays.toString(arr) + ":  " + average + ".");
        return average;
    }

    boolean isMatrixSquare(int[][] twoDimensionalArray) {
        if (twoDimensionalArray.length == twoDimensionalArray[0].length &&
                twoDimensionalArray.length >= 2) {
            System.out.println("Матрица new int[" + twoDimensionalArray.length + "]" +
                    "[" + twoDimensionalArray[0].length + "] - " + "квадратная.");
            return true;
        } else return false;
    }
}
