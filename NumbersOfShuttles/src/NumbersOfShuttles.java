public class NumbersOfShuttles {
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
            if (number >= 40 && number <= 49) {
                digitFour += 10;
                digitNine += 10;
                number += 10;
            }
            if (number >= 90 && number <= 99) {
                digitFour += 10;
                digitNine += 10;
                number += 10;
            }
            if (number >= 140 && number <= 149) {
                digitFour += 10;
                digitNine += 10;
                number += 10;
            }
            System.out.println("Номер " + i + "-го шаттла: " + number);
        }
    }
}
