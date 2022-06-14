package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        System.out.println(da.isEmpty());
        da.add(45);
        da.add(37);
        da.add(36);
        da.add(14);
        da.add(25);
        da.add(71);
        da.add(45);
        da.printArray();
        System.out.println();
        System.out.println(da.getByIndex(2));
        System.out.println(da.getFirstIndexByValue(45));
        da.set(2,89);
        da.printArray();
        System.out.println();
        System.out.println("------------------");
        da.deleteAndCopy(1);
        da.printArray();
        System.out.println();
        System.out.println("------------------");
        da.delete(4);
        da.printArray();
        System.out.println();
        System.out.println("------------------");
        da.add(2,88);
        da.printArray();

    }
}
