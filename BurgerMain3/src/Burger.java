public class Burger {
    String burgerName;
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    static char ch = 96;
    String result;

    public String burgerWithMeat() {
        if (meat.equals("двойное мясо")) {
            burgerName = "с двойным мясом";
            ++ch;
            result = ch + ". " + burgerName + " (" + bun + ", " + meat + ", " + cheese
                    + ", " + greens + ", " + mayonnaise + ")";
        }
        if (meat.equals("мясо")) {
            burgerName = "обычный бургер";
            ++ch;
            result = ch + ". " + burgerName + " (" + bun + ", " + meat + ", " + cheese
                    + ", " + greens + ", " + mayonnaise + ")";
        }
        return result;
    }

    // В данной программе использовал метод, но при этом создал два конструктора,
    // так как на вход передается одинаковое количество параметров, каждый из которых относится
    // к классу String
    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(burgerWithMeat());
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
