package homework.homework7;

public class Stack {
   private int[] stck;
  private   int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length-1) {
//            System.out.println("Cтeк заполнен . ");
        }
        else
            stck[++tos] = item;
    }

    int рор() {
        if (tos < 0) {
//            System.out.println("Cтeк не загружен . ");
            return 0;
        } else
            return stck[tos--];
    }
    void chackingStack(){
        System.out.print((tos+1)+" -->  ");
        if (tos>=0){
            for (int i = 0; i <=tos ; i++) {
                System.out.print((char)stck[i]+ " ");
            }
        }

    }


}
