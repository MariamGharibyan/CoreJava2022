package homework.arrayUtil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', ' ', ' ', 'c', 'a', 't', ' ', ' ', 'b', 'i', 'o', 'b', ' ', ' ', ' '};
        int resultLengthFirst = 0;
        int resultLengthLast = 0;
        int resultLength = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                resultLengthFirst++;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i < spaceArray.length; i--) {
            if (spaceArray[i] == ' ') {
                resultLengthLast++;
            } else {
                break;
            }
        }
        resultLength = spaceArray.length - (resultLengthFirst + resultLengthLast);
        char[] result = new char[resultLength];
        int j = 0;
        for (int i = resultLengthFirst; i < spaceArray.length; i++) {
            for (; j < result.length; ) {
                result[j] = spaceArray[i];
                j++;
                break;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }
    }
}

