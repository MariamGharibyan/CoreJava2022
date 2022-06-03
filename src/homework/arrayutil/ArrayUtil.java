package homework.arrayUtil;

public class ArrayUtil {
    void arrayElements(int[] array) {
        System.out.print("1. Մասիվի էլեմենտները՝  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    //    ----------------------------------------------------------
    void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("2. Ամենամեծ թիվը՝ " + max);
    }

    //----------------------------------------------------------------
    void min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("3. Ամենափոքր թիվը՝ " + min);
    }

    //    --------------------------------------------------
    void arrayEven(int[] array) {
        System.out.print("4․ Զույգ թվերը՝ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //    ------------------------------------------------------
    void arrayOdd(int[] array) {
        System.out.print("5․ Կենտ թվերը՝  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //    --------------------------------------------------------
    void countOfEven(int[] array) {
        int count = 0;
        System.out.print("6․ Զույգ թվերի քանակը՝  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    //---------------------------------------------------
    void countOfOdd(int[] array) {
        System.out.print("7․ Կենտ  թվերի քանակը՝  ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    //    ------------------------------------------------------------
    void mean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("8. Միջին թվաբանականը = " + sum / array.length);
    }

    //    ---------------------------------------------------------------------
    void arraySum(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i];
        }
        System.out.println("9. Մասիվի էլեմենտների գումարը = " + count);
    }

    //    -------------------------------------------------------------------
    void sortByBig(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int min = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = min;
                }
            }
        }
        System.out.print("Sorted Array from big to small  --> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

//-----------------------------------------------------------------------

    void sortBySmall(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                }
            }
        }
        System.out.print("Sorted Array from small to big --> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }

}
