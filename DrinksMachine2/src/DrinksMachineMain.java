import java.math.BigDecimal;
import java.util.Scanner;

public class DrinksMachineMain {
    public static void main(String[] args) {
        System.out.println("You can buy only the following drinks: "); // В данной программе при инициализации
        System.out.println("coffee - 50.20 UAH"); // переменных использвал числовые значения с плавающей точкой.
        System.out.println("tea - 35.50 UAH"); // Во всём остальном данная программа является аналогом прогрмаммы,
        System.out.println("lemonade - 40.55 UAH"); // которая находится в папке "DrinksMachine".
        System.out.println("mojito - 45.80 UAH");
        System.out.println("mineral_water - 20.65 UAH");
        System.out.println("coca_cola - 46.75 UAH");
        System.out.println("------------------------------------");
        Drinks drinks = new Drinks();
        Scanner in = new Scanner(System.in);
        BigDecimal numberOfCoffee;
        BigDecimal numberOfTea;
        BigDecimal numberOfLemonade;
        BigDecimal numberOfMojito;
        BigDecimal numberOfMineralWater;
        BigDecimal numberOfCocaCola;

        do {
            System.out.print("Indicate the drink exactly according to the name " +
                    "\nof the drinks indicated in the list above: ");
            Drinks.drinksChoice = in.next();
            if (Drinks.drinksChoice.equals("coffee")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfCoffee = in.nextBigDecimal();
                Drinks.totalAmountOfCoffee = Drinks.totalAmountOfCoffee.add(numberOfCoffee);
            }
            if (Drinks.drinksChoice.equals("tea")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfTea = in.nextBigDecimal();
                Drinks.totalAmountOfTea = Drinks.totalAmountOfTea.add(numberOfTea);
            }
            if (Drinks.drinksChoice.equals("lemonade")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfLemonade = in.nextBigDecimal();
                Drinks.totalAmountOfLemonade = Drinks.totalAmountOfLemonade.add(numberOfLemonade);
            }
            if (Drinks.drinksChoice.equals("mojito")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfMojito = in.nextBigDecimal();
                Drinks.totalAmountOfMojito = Drinks.totalAmountOfMojito.add(numberOfMojito);
            }
            if (Drinks.drinksChoice.equals("mineral_water")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfMineralWater = in.nextBigDecimal();
                Drinks.totalAmountOfMineralWater = Drinks.totalAmountOfMineralWater.add(numberOfMineralWater);
            }
            if (Drinks.drinksChoice.equals("coca_cola")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfCocaCola = in.nextBigDecimal();
                Drinks.totalAmountOfCocaCola = Drinks.totalAmountOfCocaCola.add(numberOfCocaCola);
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
