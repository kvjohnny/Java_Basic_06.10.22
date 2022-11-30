import java.math.BigDecimal;

public class Drinks {
    public static final BigDecimal COFFEE_PRICE = new BigDecimal("50.20");
    public static final BigDecimal TEA_PRICE = new BigDecimal("35.50");
    public static final BigDecimal LEMONADE_PRICE = new BigDecimal("40.55");
    public static final BigDecimal MOJITO_PRICE = new BigDecimal("45.80");
    public static final BigDecimal MINERAL_WATER_PRICE = new BigDecimal("20.65");
    public static final BigDecimal COCA_COLA_PRICE = new BigDecimal("46.75");


    public static String coffee;
    public static String tea;
    public static String lemonade;
    public static String mojito;
    public static String mineralWater;
    public static String cocaCola;


    public static BigDecimal totalAmountOfCoffee = new BigDecimal("0");
    public static BigDecimal totalAmountOfTea = new BigDecimal("0");
    public static BigDecimal totalAmountOfLemonade = new BigDecimal("0");
    public static BigDecimal totalAmountOfMojito = new BigDecimal("0");
    public static BigDecimal totalAmountOfMineralWater = new BigDecimal("0");
    public static BigDecimal totalAmountOfCocaCola = new BigDecimal("0");
    public static BigDecimal totalPrice;
    public static String drinksChoice;
    public static String choice = "yes";


    public static BigDecimal calculateTotalPrice() {
        return totalPrice = COFFEE_PRICE.multiply(totalAmountOfCoffee).add(TEA_PRICE.multiply(totalAmountOfTea)).add
                (LEMONADE_PRICE.multiply(totalAmountOfLemonade)).add(MOJITO_PRICE.multiply(totalAmountOfMojito)).add
                (MINERAL_WATER_PRICE.multiply(totalAmountOfMineralWater)).add(COCA_COLA_PRICE.multiply(totalAmountOfCocaCola));
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
