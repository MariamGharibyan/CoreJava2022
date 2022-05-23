package homework.arrayUtil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {0, 800, 20, 200, 6, 16, 2, -70, -9, 10, 2, 7};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int min = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = min;
                }
            }
        }
        System.out.print("1. Sorted Array from big to small  --> ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
//        --------------------------------------------------------------------------------------
        int[] numbersClone = {1500, -7, 406, 200, 8000, 146, 16, -9, 0, 180, 12, 120};
        for (int i = 0; i < numbersClone.length; i++) {
            for (int j = 0; j < numbersClone.length - 1; j++) {
                if (numbersClone[j] > numbersClone[j + 1]) {
                    int max = numbersClone[j];
                    numbersClone[j] = numbersClone[j + 1];
                    numbersClone[j + 1] = max;
                }
            }
        }
        System.out.println();
        System.out.print("2. Sorted Array from small to big --> ");
        for (int i = 0; i < numbersClone.length; i++) {
            System.out.print(numbersClone[i] + " ");
        }
    }
}