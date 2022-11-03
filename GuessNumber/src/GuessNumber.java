import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int hiddenNumber = 3;
        int currentAttempt = 1;
        int min = 0; // мінімальне число діапазону, яке можна змінювати
        int max = 10; // максимальне число діапазону, яке можна змінювати
        int maxAttempts = 4; // можна змінювати максимальну кількість спроб

        System.out.print("Вгадайте ціле число від " + min + " до " + max + ". " +
                "Максимальна кількість спроб - " + maxAttempts + ".\n");

        while (currentAttempt <= maxAttempts) {
            Scanner in = new Scanner(System.in);
            System.out.print("Спроба " + currentAttempt + ". " + "Введіть число: ");
            int num = in.nextInt();
            if (num > max || num < min) {
                System.out.println("Ви ввели число поза діапазоном від " + min + " до " + max
                        + ". " + "Спробу не зараховано.");
            }
            if (num != hiddenNumber && num >= min && num <= max) {
                if (currentAttempt == maxAttempts) {
                    System.out.println("Ви не вгадали. На жаль, Ви програли.");
                    break;
                }
                System.out.println("Ви не вгадали. Спробуйте ще.");
                currentAttempt++;
            }
            if (num == hiddenNumber) {
                System.out.println("Ви вгадали! Вітаємо з перемогою!");
                break;
            }
        }
    }
}
