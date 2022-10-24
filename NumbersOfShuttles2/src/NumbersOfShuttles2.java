public class NumbersOfShuttles2 {
    public static void main(String[] args) {
        int digitFour = 4;
        int digitNine = 9;
        int number = 0;
        int i = 1;

        for (; i <= 100; i++) {

            number++;

            if (number == digitFour) {
                digitFour += 10;
                number++;
            }
            if (number == digitNine) {
                digitNine += 10;
                number++;
            }
            // Это альтернативная часть кода, указанного в файле NumbersOfShuttles
            // и стостоящего из трех последних условных инструкций if.
            // Этот вариант более громоздкий
            // в плане условия инструкции if, но в целом менее объемный.
            if ((number >= 40 && number <= 49) || (number >= 90 && number <= 99)
                    || (number >= 140 && number <= 149)) {
                digitFour += 10;
                digitNine += 10;
                number += 10;
            }
            System.out.println("Номер " + i + "-го шаттла: " + number);
        }
    }
}
