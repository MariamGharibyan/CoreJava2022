package homework.homework6;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework test = new PracticeHomework();

        System.out.println( test.isSame(8,8));
        System.out.println(test.nextNumber(7));
        System.out.println(test.lessThanOrEqualToZero(-4));
        System.out.println(test.calcAge(5));
        System.out.println(test.reverseBool(5==5));
        int[] array1 = {1,5,8,9,3,4,};
        int[] array2 = {2,5,8,7,9,6,4,7,8};
        System.out.println(test.maxLenght(array1,array2));

    }
}
