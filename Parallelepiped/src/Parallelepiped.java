public class Parallelepiped {
    public static void main(String[] args) {
        int w = 5, l = 4, h = 6;
        int volume, length;
        volume = w * l * h;
        length = (w + l + h) * 4;
        System.out.println("Объем параллелепипеда = " + volume);
        System.out.println("Периметр параллелепипеда = " + length);
    }
}
