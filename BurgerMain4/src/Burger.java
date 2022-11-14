public class Burger {
    /* Измененный вариант прогрмаммы, которая находится в папке
    BurgerMain3. В этой программе для определения вида бургера
    в зависимости от количества такого ингредиента, как мясо,
    использовал переменную типа boolean. */
    String burgerName;
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    static char ch = 96;
    String result;
    boolean isDoubleMeat;

    public String cookBurgerWithMeat() {
        isDoubleMeat = meat.equals("двойное мясо");
        if (isDoubleMeat) {
            burgerName = "с двойным мясом";
            ++ch;
            result = ch + ". " + burgerName + " (" + bun + ", " + meat + ", " + cheese
                    + ", " + greens + ", " + mayonnaise + ")";
        }
        if (!isDoubleMeat) {
            burgerName = "обычный бургер";
            ++ch;
            result = ch + ". " + burgerName + " (" + bun + ", " + meat + ", " + cheese
                    + ", " + greens + ", " + mayonnaise + ")";
        }
        return result;
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(cookBurgerWithMeat());
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        ++ch;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        burgerName = "диетический бургер";
        System.out.println(ch + ". " + burgerName + " (" + bun + ", " + meat + ", " + cheese
                + ", " + greens + ")");
    }
}
