package homework.homework4.arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {
//        1.---------------------------------------------------------------------------
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int quantity = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                quantity++;
            }
        }
        System.out.println("1. The quantity is = " + quantity);

//   2.     -------------------------------------------------------------------------
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println("2. Those are the middle symbols of array --> " + chars[chars2.length / 2 - 1] + ", " + chars[chars2.length / 2]);

//   3.      ---------------------------------------------------------------------------------------------------------------------------
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println("3. True");
        } else {
            System.out.println("3. False");
        }

//    4.   -----------------------------------------------------------------------------------------------------------------------------
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        int indicator = 0;
        for (int i = 0; i < bobArray.length; i++) {
            if (i + 2 < bobArray.length && bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                indicator++;
            }
        }
        if (indicator >= 1) {
            System.out.println("4. True");
        } else {
            System.out.println("4. False");
        }

//   5.     ---------------------------------------------------------------------------------------------------------------------
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        System.out.print("5. ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }

        }

    }
}


