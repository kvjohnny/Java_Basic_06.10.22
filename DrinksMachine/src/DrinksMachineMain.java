import java.util.Scanner;

public class DrinksMachineMain {
    public static void main(String[] args) {
        System.out.println("You can buy only the following drinks: "); // В данной программе при инициализации
        System.out.println("coffee - 50 UAH"); // переменных использвал целочисленные значения.
        System.out.println("tea - 35 UAH");  // Добавил возможность повторно выбирать одни и те же напитки.
        System.out.println("lemonade - 40 UAH"); //  При неправильном вводе названия напитков, а также
        System.out.println("mojito - 45");  // слов "yes" или "no" в случае предложения выбрать напитки,
        System.out.println("mineral_water - 20"); // указывается об этом обстоятельстве и предлагается
        System.out.println("coca_cola - 46"); // продолжить выполнение программы.
        System.out.println("------------------------------------"); // В названиях напитков, которые предлагаются
        Drinks drinks = new Drinks(); // пользователю, использовал одинаковый дизайн.
        Scanner in = new Scanner(System.in);
        int numberOfCoffee;
        int numberOfTea;
        int numberOfLemonade;
        int numberOfMojito;
        int numberOfMineralWater;
        int numberOfCocaCola;

        do {
            System.out.print("Indicate the drink exactly according to the name " +
                    "\nof the drinks indicated in the list above: ");
            Drinks.drinksChoice = in.next();
            if (Drinks.drinksChoice.equals("coffee")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfCoffee = in.nextInt();
                Drinks.totalAmountOfCoffee = Drinks.totalAmountOfCoffee + numberOfCoffee;
            }
            if (Drinks.drinksChoice.equals("tea")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfTea = in.nextInt();
                Drinks.totalAmountOfTea = Drinks.totalAmountOfTea + numberOfTea;
            }
            if (Drinks.drinksChoice.equals("lemonade")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfLemonade = in.nextInt();
                Drinks.totalAmountOfLemonade = Drinks.totalAmountOfLemonade + numberOfLemonade;
            }
            if (Drinks.drinksChoice.equals("mojito")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfMojito = in.nextInt();
                Drinks.totalAmountOfMojito = Drinks.totalAmountOfMojito + numberOfMojito;
            }
            if (Drinks.drinksChoice.equals("mineral_water")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfMineralWater = in.nextInt();
                Drinks.totalAmountOfMineralWater = Drinks.totalAmountOfMineralWater + numberOfMineralWater;
            }
            if (Drinks.drinksChoice.equals("coca_cola")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfCocaCola = in.nextInt();
                Drinks.totalAmountOfCocaCola = Drinks.totalAmountOfCocaCola + numberOfCocaCola;
            }
            if (!Drinks.drinksChoice.equals("tea") & !Drinks.drinksChoice.equals("coffee") &
                    !Drinks.drinksChoice.equals("lemonade") & !Drinks.drinksChoice.equals("mojito") &
                    !Drinks.drinksChoice.equals("mineral_water") & !Drinks.drinksChoice.equals("coca_cola")) {
                System.out.println("There is no such drink. Try again.");
                continue;
            }

            System.out.print("Anything else? (yes/no) ");
            Drinks.choice = in.next();
            while (!Drinks.choice.equals("yes") & !Drinks.choice.equals("no")) {
                System.out.println("You entered the wrong word. Try again.");
                System.out.print("Anything else? (yes/no) ");
                Drinks.choice = in.next();
            }

        } while (Drinks.choice.equals("yes"));

        DrinksMachine drinksMachine = DrinksMachine.valueOf(Drinks.drinksChoice.toUpperCase());
        switch (drinksMachine) {
            case COFFEE:
                drinks.makeCoffee();
                break;
            case TEA:
                drinks.makeTea();
                break;
            case LEMONADE:
                drinks.makeLemonade();
                break;
            case MOJITO:
                drinks.makeMojito();
                break;
            case MINERAL_WATER:
                drinks.makeMineralWater();
                break;
            case COCA_COLA:
                drinks.makeCocaCola();
                break;
            default:
                System.out.println("It's uncorrected choice.");
                break;
        }
        System.out.println("Total cost -    " + Drinks.calculateTotalPrice() + " UAH");
    }
}