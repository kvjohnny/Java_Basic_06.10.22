public class NumbersOfShuttles5 {
    public static void main(String[] args) {
        int four = 4;
        int nine = 9;
        int number = 0;
        int numbersOfShuttles = 100;

        for (int f = 0; f < 10; f++) {
            for (int s = 0; s < 10; s++) {
                for (int t = 0; t < 10; t++) {

                    if (f == 0 && s == 0 && t == 0) {
                        continue;
                    }
                    if (number == numbersOfShuttles) {
                        break;
                    }
                    number++;

                    if ((f != four && f != nine) && (s != four && s != nine)
                            && (t != four && t != nine)) {
                        System.out.println("Номер " + number + "-го шаттла: " + f + s + t);
                    } else {
                        number--;
                    }
                }
            }
        }
    }
}