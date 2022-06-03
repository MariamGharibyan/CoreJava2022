package homework.arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 25, 14, 36, 17, 58, 69, 111, 1};
        ArrayUtil demo = new ArrayUtil();

        demo.arrayElements(numbers);
        System.out.println();
//        ---------------------------------------------
        demo.max(numbers);
//        --------------------------------------------------
        demo.min(numbers);
//        --------------------------------------------------------------
        demo.arrayEven(numbers);
//        ------------------------------------------------------------
        System.out.println();
        demo.arrayOdd(numbers);
//        ---------------------------------------------------------------
        System.out.println();
        demo.countOfEven(numbers);
//        -----------------------------------------------------
        demo.countOfOdd(numbers);
//        -------------------------------------------------------
        demo.mean(numbers);
//        -----------------------------------------------------------
        demo.arraySum(numbers);
//        ---------------------------------------------------------
        demo.sortByBig(numbers);
//        ------------------------------------------------------------
        System.out.println();
        demo.sortBySmall(numbers);
    }

}
