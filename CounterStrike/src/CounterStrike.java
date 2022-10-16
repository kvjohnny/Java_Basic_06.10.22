public class CounterStrike {
    public static void main(String[] args) {

    String teamFirst = "Eagles";
    int f_1 = 34, f_2 = 2, f_3 = 84,
            f_4 = 61, f_5 = 18;

    String teamSecond = "Hornets";
    int s_1 = 26, s_2 = 75, s_3 = 43,
            s_4 = 48, s_5 = 66;

    double result_1 = (f_1 + f_2 + f_3 + f_4 + f_5) / 5.0;
    double result_2 = (s_1 + s_2 + s_3 + s_4 + s_5) / 5.0;

        if (result_1 > result_2) {
            System.out.println("Победила команда " + teamFirst + ", набравшая " + result_1 + " очков.");
        }
        else if (result_1 < result_2) {
            System.out.println("Победила команда " + teamSecond + ", набравшая " + result_2 + " очков.");
        }
        else {
            System.out.println("Ничья: команды набрали одинаковое количество очков - " + result_1);
        }
    }
}
