public class Rugby {
    public static void main(String[] args) {
        int[] agesOfFirstTeam = {25, 18, 38, 22, 35, 19, 27, 20, 39, 31,
                37, 23, 34, 30, 24, 33, 40, 21, 28, 33,
                36, 29, 38, 24, 26};
        int[] agesOfSecondTeam = {19, 22, 34, 20, 33, 39, 31, 22, 24, 27,
                30, 21, 36, 28, 21, 29, 39, 37, 21, 24,
                21, 29, 33, 27, 22};
        double sumOfAgesFirstTeam = 0.0;
        double sumOfAgesSecondTeam = 0.0;

        System.out.println("Возраст игроков первой команды: ");
        for (int ageFirstTeam : agesOfFirstTeam) {
            System.out.print(ageFirstTeam + " ");
            sumOfAgesFirstTeam += ageFirstTeam;
        }

        System.out.println('\n');

        System.out.println("Возраст игроков второй команды: ");
        for (int ageOfSecondTeam : agesOfSecondTeam) {
            System.out.print(ageOfSecondTeam + " ");
            sumOfAgesSecondTeam += ageOfSecondTeam;
        }

        System.out.println('\n');

        double averageAgeOfFirstTeam = sumOfAgesFirstTeam / agesOfFirstTeam.length;
        System.out.println("Средний возраст первой команды: " + averageAgeOfFirstTeam);

        double averageAgeOfSecondTeam = sumOfAgesSecondTeam / agesOfSecondTeam.length;
        System.out.println("Средний возраст второй команды: " + averageAgeOfSecondTeam);
    }
}
