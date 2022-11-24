import java.math.BigDecimal;
import java.util.Scanner;

public class MainDrinksMachine2 {
    public static void main(String[] args) {
        System.out.println("You can buy only the following drinks: "); // В данной программе при инициализации
        System.out.println("coffee - 50.20 UAH"); // переменных использвал числовые значения с плавающей точкой.
        System.out.println("tea - 35.50 UAH"); // Во всём остальном данная программа является аналогом прогрмаммы,
        System.out.println("lemonade - 40.55 UAH"); // которая находится в папке "DrinksMachine".
        System.out.println("mojito - 45.80 UAH");
        System.out.println("mineral_water - 20.65 UAH");
        System.out.println("coca_cola - 46.75 UAH");
        System.out.println("------------------------------------");
        Drinks2 drinks2 = new Drinks2();
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
            Drinks2.drinksChoice = in.next();
            if (Drinks2.drinksChoice.equals("coffee")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfCoffee = in.nextBigDecimal();
                Drinks2.totalAmountOfCoffee = Drinks2.totalAmountOfCoffee.add(numberOfCoffee);
            }
            if (Drinks2.drinksChoice.equals("tea")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfTea = in.nextBigDecimal();
                Drinks2.totalAmountOfTea = Drinks2.totalAmountOfTea.add(numberOfTea);
            }
            if (Drinks2.drinksChoice.equals("lemonade")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfLemonade = in.nextBigDecimal();
                Drinks2.totalAmountOfLemonade = Drinks2.totalAmountOfLemonade.add(numberOfLemonade);
            }
            if (Drinks2.drinksChoice.equals("mojito")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfMojito = in.nextBigDecimal();
                Drinks2.totalAmountOfMojito = Drinks2.totalAmountOfMojito.add(numberOfMojito);
            }
            if (Drinks2.drinksChoice.equals("mineral_water")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfMineralWater = in.nextBigDecimal();
                Drinks2.totalAmountOfMineralWater = Drinks2.totalAmountOfMineralWater.add(numberOfMineralWater);
            }
            if (Drinks2.drinksChoice.equals("coca_cola")) {
                System.out.print("Select the amount of this type of drink " +
                        "(enter an integer, greater than zero): ");
                numberOfCocaCola = in.nextBigDecimal();
                Drinks2.totalAmountOfCocaCola = Drinks2.totalAmountOfCocaCola.add(numberOfCocaCola);
            }
            if (!Drinks2.drinksChoice.equals("tea") & !Drinks2.drinksChoice.equals("coffee") &
                    !Drinks2.drinksChoice.equals("lemonade") & !Drinks2.drinksChoice.equals("mojito") &
                    !Drinks2.drinksChoice.equals("mineral_water") & !Drinks2.drinksChoice.equals("coca_cola")) {
                System.out.println("There is no such drink. Try again.");
                continue;
            }

            System.out.print("Anything else? (yes/no) ");
            Drinks2.choice = in.next();
            while (!Drinks2.choice.equals("yes") & !Drinks2.choice.equals("no")) {
                System.out.println("You entered the wrong word. Try again.");
                System.out.print("Anything else? (yes/no) ");
                Drinks2.choice = in.next();
            }

        } while (Drinks2.choice.equals("yes"));

        DrinksMachine2 drinksMachine2 = DrinksMachine2.valueOf(Drinks2.drinksChoice.toUpperCase());
        switch (drinksMachine2) {
            case COFFEE:
                drinks2.makeCoffee();
                break;
            case TEA:
                drinks2.makeTea();
                break;
            case LEMONADE:
                drinks2.makeLemonade();
                break;
            case MOJITO:
                drinks2.makeMojito();
                break;
            case MINERAL_WATER:
                drinks2.makeMineralWater();
                break;
            case COCA_COLA:
                drinks2.makeCocaCola();
                break;
            default:
                System.out.println("It's uncorrected choice.");
                break;
        }
        System.out.println("Total cost -    " + Drinks2.calculateTotalPrice() + " UAH");
    }
}
