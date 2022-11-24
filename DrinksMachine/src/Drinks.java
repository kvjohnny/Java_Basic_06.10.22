
public class Drinks {
    public static final int COFFEE_PRICE = 50;
    public static final int TEA_PRICE = 35;
    public static final int LEMONADE_PRICE = 40;
    public static final int MOJITO_PRICE = 45;
    public static final int MINERAL_WATER_PRICE = 20;
    public static final int COCA_COLA_PRICE = 46;


    public static String coffee;
    public static String tea;
    public static String lemonade;
    public static String mojito;
    public static String mineralWater;
    public static String cocaCola;


    public static int totalAmountOfCoffee = 0;
    public static int totalAmountOfTea = 0;
    public static int totalAmountOfLemonade = 0;
    public static int totalAmountOfMojito = 0;
    public static int totalAmountOfMineralWater = 0;
    public static int totalAmountOfCocaCola = 0;
    public static int totalPrice;
    public static String drinksChoice;
    public static String choice = "yes";


    public static int calculateTotalPrice() {
        return totalPrice = COFFEE_PRICE * totalAmountOfCoffee + TEA_PRICE * totalAmountOfTea +
                LEMONADE_PRICE * totalAmountOfLemonade + MOJITO_PRICE * totalAmountOfMojito +
                MINERAL_WATER_PRICE * totalAmountOfMineralWater + COCA_COLA_PRICE * totalAmountOfCocaCola;
    }

    public void makeTea() {
        tea = "tea";

    }

    public void makeCoffee() {
        coffee = "coffee";

    }

    public void makeLemonade() {
        lemonade = "lemonade";

    }

    public void makeMojito() {
        mojito = "mojito";

    }

    public void makeMineralWater() {
        mineralWater = "mineral_water";

    }

    public void makeCocaCola() {
        cocaCola = "coca_cola";

    }
}
