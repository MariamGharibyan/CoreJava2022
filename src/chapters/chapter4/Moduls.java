package chapters.chapter4;

public class Moduls {
    public static void main(String[] args) {
        double x = 45.4;
        double y = 45.5;
        y += y;
        y += y;
        y--;

        System.out.println(x % 10 + ", " + y);

    }
}
