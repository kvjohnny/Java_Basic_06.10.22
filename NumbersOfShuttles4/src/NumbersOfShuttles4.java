public class NumbersOfShuttles4 {
    public static void main(String[] args) {
        int four = 4;
        int nine = 9;
        int num = 0;
        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            num++;
            numbers[i] = num;
            if (num == four || num == nine
                    || num % 10 == four || num % 10 == nine
                    || num % 100 / 10 == four || num % 100 / 10 == nine) {
                i--;
                continue;
            }
            System.out.println("Номер " + (i + 1) + "-го шаттла: " + numbers[i]);
        }
    }
}
