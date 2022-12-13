package org.example;

public class MatrixMain {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 1};

        Matrix matrix = new Matrix();
        matrix.calculateAverage(array);
        System.out.println("----------------------------------------------");
        matrix.isMatrixSquare(new int[2][2]);
    }
}
