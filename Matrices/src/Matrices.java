import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        int bound = 10;

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть розмір матриці M: ");
        int num = in.nextInt();
        System.out.print("Введіть розмір матриці N: ");
        int num2 = in.nextInt();

        int[][] first = new int[num][num2];
        int[][] second = new int[num2][num];

        for (int i = 0; i < num; i++) {
            for (int k = 0; k < num2; k++) {
                Random randomizer = new Random();
                int randomIntInBound = randomizer.nextInt(bound);
                first[i][k] = randomIntInBound;
                second[k][i] = first[i][k];
                System.out.print(first[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for (int k = 0; k < num2; k++) {
            for (int i = 0; i < num; i++) {
                System.out.print(second[k][i] + " ");
            }
            System.out.println();
        }
    }
}
