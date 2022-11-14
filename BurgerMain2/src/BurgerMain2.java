public class BurgerMain2 {
    public static void main(String[] args) {
        Burger burger1 = new Burger("булочка", "мясо", "сыр",
                "зелень", "майонез");
        System.out.println(Burger.ch + ". " + burger1.burgerName + " (" + burger1.bun + ", " + burger1.meat1 + ", "
                + burger1.cheese + ", " + burger1.greens + ", " + burger1.mayonnaise + ")");
        Burger burger2 = new Burger("булочка", "мясо", "сыр",
                "зелень");
        System.out.println(Burger.ch + ". " + burger2.burgerName + " (" + burger2.bun + ", " + burger2.meat1 + ", "
                + burger2.cheese + ", " + burger2.greens + ")");
        Burger burger3 = new Burger("булочка", "мясо", "мясо", "сыр",
                "зелень", "майонез");
        System.out.println(Burger.ch + ". " + burger3.burgerName + " (" + burger3.bun + ", " + burger3.meat1 + ", "
                + burger3.meat2 + ", " + burger3.cheese + ", " + burger3.greens + ", " + burger3.mayonnaise + ")");
    }
}
