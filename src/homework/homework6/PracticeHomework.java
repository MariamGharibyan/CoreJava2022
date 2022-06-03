package homework.homework6;

public class PracticeHomework {
    long convert(int minutes) {
        long bySeconds = 60 * minutes;
        return bySeconds;
    }

    //    -------------------------------------------------
    int calcAge(int years) {
        int countOfDays = 365 * years;
        return countOfDays;
    }
//   --------------------------------------------
    int nextNumber(int number){
        return ++number;
    }

//    ------------------------------------------
    boolean isSame(int a, int b){
        if(a==b){
            return true;
        }
        return false;
    }
//    --------------------------------------------------
    boolean lessThanOrEqualToZero(int number){
        if(number<=0){
            return true;
        }
        return false;
    }
//    ------------------------------------------------------
    boolean reverseBool(boolean value) {
        return !value;
    }
//    ------------------------------------------
    int maxLenght(int[] array1, int[] array2){
        if(array1.length>array2.length){
            return array1.length;
        }
        return array2.length;
    }



}
