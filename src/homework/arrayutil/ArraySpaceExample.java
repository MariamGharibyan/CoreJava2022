package homework.arrayUtil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' '};
        int resultLength = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                resultLength++;
            }
        }
        char[] result = new char[resultLength];
        int j = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                for (; j < result.length; ) {
                    result[j] = spaceArray[i];
                    j++;
                    break;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }
    }
}

