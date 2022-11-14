public class Burger {
    String burgerName;
    String bun;
    String meat1;
    String meat2;
    String cheese;
    String greens;
    String mayonnaise;
    static char ch = 96;

    public Burger(String bun, String meat1, String cheese, String greens, String mayonnaise) {
        ++ch;
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        burgerName = "обычный бургер";
        System.out.println(ch + ". " + burgerName + " (" + bun + ", " + meat1 + ", " + cheese
                + ", " + greens + ", " + mayonnaise + ")");
    }

    public Burger(String bun, String meat1, String cheese, String greens) {
        ++ch;
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        burgerName = "диетический бургер";
        System.out.println(ch + ". " + burgerName + " (" + bun + ", " + meat1 + ", " + cheese
                + ", " + greens + ")");
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String mayonnaise) {
        ++ch;
        this.bun = bun;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        burgerName = "с двойным мясом";
        System.out.println(ch + ". " + burgerName + " (" + bun + ", " + meat1 + ", " + meat2 + ", " + cheese
                + ", " + greens + ", " + mayonnaise + ")");
    }
}
