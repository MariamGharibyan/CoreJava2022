package homework.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getByIndex(int index) {
        return array[index];
    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;

    }

    void set(int index, int value) {
        if (index > array.length) {
            int[] temp = new int[array.length + index];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
                size = size +index;
            }
            array = temp;
        }
        array[index] = value;

    }

    void add(int index, int value) {         /* թերի է */
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                int temprary = array[i];
                array[i] = value;
                for (int j = i; j < array.length - 2; j++) {
                    array[j + 1] = array[j+2];

                }
            } else {
                temp[i] = array[i];
            }
        }


    }

    void deleteAndCopy(int index) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            } else {
                temp[i] = array[i];
            }
        }

    }

    void delete(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

    }


}