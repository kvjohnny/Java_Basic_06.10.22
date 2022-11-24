public class MainFitnessTracker {
    public static void main(String[] args) {
        AccountInfo accountInfo1 = new AccountInfo("Александр", "Степаненко",
                20, "июня", 1983, "alex_stepanenko@gmail.com",
                "+380503454486", 75.3, "110/80", 4500L);
        System.out.println(accountInfo1.printAccountInfo());

        AccountInfo accountInfo2 = new AccountInfo("Оксана", "Марчук",
                5, "апреля", 1991, "oksana_marchuk@gmail.com",
                "+380971529533", 60.2, "115/75", 3500L);
        System.out.println(accountInfo2.printAccountInfo());

        AccountInfo accountInfo3 = new AccountInfo("Андрей", "Бондарук",
                14, "декабря", 1988, "andrew_bondaruk@gmail.com",
                "+380666219045", 82.6, "125/85", 5000L);
        System.out.println(accountInfo3.printAccountInfo());

        AccountInfo accountInfo4 = new AccountInfo("Ирина", "Романенко",
                7, "марта", 1993, "irina_romanenko@gmail.com",
                "+380968047936", 65.7, "115/80", 3800L);
        System.out.println(accountInfo4.printAccountInfo());

        accountInfo2.setFamilyName("Артемук");
        accountInfo2.setPressure("125/90");
        accountInfo2.setNumberOfSteps(3000L);
        System.out.println(accountInfo2.printAccountInfo());

        accountInfo3.setWeight(87.3);
        accountInfo3.setPressure("130/90");
        accountInfo3.setNumberOfSteps(4500L);
        System.out.println(accountInfo3.printAccountInfo());
    }
}
