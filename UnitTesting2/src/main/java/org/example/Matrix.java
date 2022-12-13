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
/*
* В программе, которая находится в папке "UnitTesting"
* возвращал булевое значение. В данной программе возращаю целочисленное.
* Кроме того, добавил возможность выведения в консоль информации о
* том, что матрица не квадратная при подтверждении такого факта.
*/
    int isMatrixSquare(int[][] twoDimensionalArray) {
        if (twoDimensionalArray.length == twoDimensionalArray[0].length &
                twoDimensionalArray.length >= 2) {
            System.out.println("Матрица new int[" + twoDimensionalArray.length + "]" +
                    "[" + twoDimensionalArray[0].length + "] - " + "квадратная.");
            return 1;
        }
        if (twoDimensionalArray.length != twoDimensionalArray[0].length) {
            System.out.println("Матрица new int[" + twoDimensionalArray.length + "]" +
                    "[" + twoDimensionalArray[0].length + "] - " + "не квадратная.");
        }
        if (twoDimensionalArray.length == twoDimensionalArray[0].length
                & twoDimensionalArray.length < 2) {
            System.out.println("Матрица new int[" + twoDimensionalArray.length + "]" +
                    "[" + twoDimensionalArray[0].length + "] - " + "не квадратная.");
        }
        return 0;
    }
}
