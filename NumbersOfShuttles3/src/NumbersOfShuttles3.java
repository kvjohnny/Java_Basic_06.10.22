public class NumbersOfShuttles3 {
    public static void main(String[] args) {
        int four = 4;
        int nine = 9;
        int number = 100;

        for (int i = 1; i <= 100; i++) {
            if (number >= 100 && number < 1000) {
                number++;
                if ((number % 10 == four) || (number % 10 == nine)
                        || (number % 100 / 10 == four) || (number % 100 / 10 == nine)) {
                    i--;
                    continue;
                }
                System.out.println("Номер " + i + "-го шаттла: " + number);
            }
        }
    }
}
