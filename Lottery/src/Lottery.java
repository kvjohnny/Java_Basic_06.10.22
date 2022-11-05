import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {

        int length = 7;
        int[] first = new int[length];
        int[] second = new int[length];
        int numberOfMatches = 0;
        int bound = 10;

        for (int i = 0; i < length; i++) {   // Не использовал first.length или second.length,
            Random randomizer = new Random(); // так как в задаче указано два массива одинковой длины.
            int randomIntInBound = randomizer.nextInt(bound); // Декларирование переменной с именем length,
            first[i] = randomIntInBound; // на мой взляд, является универсальным вариантом для двух массивов
            int randomIntInBound2 = randomizer.nextInt(bound); // одиноковой длины.
            second[i] = randomIntInBound2;
        }
        //bubble
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (first[j - 1] > first[j]) {
                    int tmp = first[j - 1];
                    first[j - 1] = first[j];
                    first[j] = tmp;
                }
                if (second[j - 1] > second[j]) {
                    int tmp1 = second[j - 1];
                    second[j - 1] = second[j];
                    second[j] = tmp1;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (first[i] == second[i]) {
                numberOfMatches++;
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println("Количество совпадений: " + numberOfMatches);
    }
}
