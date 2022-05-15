package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 8, 25, 14, 36, 17, 58, 69, 111, 1};
        int x = 0;
        double z = 0;
        int max = array[0];
        int min = array[0];
        System.out.print("1. Մասիվի էլեմենտները՝  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
//---------------------------------------------------------------------------------------
        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("2. Ամենամեծ թիվը՝ " + max);
//-----------------------------------------------------------------------------
        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("3. Ամենափոքր թիվը՝ " + min);
//        -----------------------------------------------------------------------
        System.out.print("4․ Զույգ թվերը՝ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
//        -----------------------------------------------------------------------------
        System.out.print("5․ Կենտ թվերը՝  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
//-------------------------------------------------------------------------------------
        System.out.print("6․ Զույգ թվերի քանակը՝  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                x++;
            }

        }
        System.out.println(x);

//------------------------------------------------------------------------------------------
        System.out.print("7․ Կենտ  թվերի քանակը՝  ");
        x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                x++;
            }

        }
        System.out.println(x);

//------------------------------------------------------------------------------------------------

        for (int i = 0; i < array.length; i++) {
            z = z + array[i];
        }
        System.out.println("8. Միջին թվաբանականը   = " + z / array.length);


//   -------------------------------------------------------------------------------------------------
        x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        System.out.println("9. Մասիվի էլեմենտների գումարը   = " + x);

;

    }
}