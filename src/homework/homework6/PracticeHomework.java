package homework.homework6;

public class PracticeHomework {
    long convert(int minutes) {
        return 60 * minutes;
    }

    //    -------------------------------------------------
    int calcAge(int years) {
        return years * 365;
    }
//   --------------------------------------------
    int nextNumber(int number){
        return ++number;
    }

//    ------------------------------------------
    boolean isSame(int a, int b) {
        return (a == b);
    }
//    --------------------------------------------------
    boolean lessThanOrEqualToZero(int number){
        return  (number<=0);
        }

//    ------------------------------------------------------
    boolean reverseBool(boolean value) {
        return !value;
    }
//    ------------------------------------------
    int maxLenght(int[] array1, int[] array2){
     return  array1.length>array2.length ? array1.length : array2.length;
    }



}
