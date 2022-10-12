public class China {
    public static void main(String[] args) {
        int w1 = 13, a1 = 24, r1 = 46;
        int w2 = 9, a2 = 35, r2 = 12;
        int amountOfLy = (w1 + a1 + r1) * 860;
        double amountOfMin = (w2 + a2 + r2) * 860 * 1.5;

        System.out.println("Общий показатель атаки для династии Ли: " + amountOfLy);
        System.out.println("Общий показатель атаки для династии Минь: " + amountOfMin);
    }
}
