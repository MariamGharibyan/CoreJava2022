package classwork.lesson6;

public class ArrayExample {
    public static void main(String[] args) {
        int[] number = new int[10];
        number[7]=20;
        number[0]=10;
        System.out.println(number[7]/number[0]);
        System.out.println(number.length);
        System.out.println(number.length*2);

        for (int i = 0; i < number.length ; i++) {
            System.out.println(number[i]);
        }
    }
}
