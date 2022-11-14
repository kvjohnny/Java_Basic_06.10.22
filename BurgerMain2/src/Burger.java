public class Burger {
    /*В данной программе IDEA "не ругается", но в конструктор не добавлен вывод
    в консоль составов разных вариантов бургеров*/
    String burgerName;
    String bun;
    String meat1;
    String meat2;
    String cheese;
    String greens;
    String mayonnaise;
    static char ch = 97;

    public Burger(String bun, String meat1, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        burgerName = "обычный бургер";
    }

    public Burger(String bun, String meat1, String cheese, String greens) {
        ++ch;
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        burgerName = "диетический  бургер";
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
    }
}
