package homework.homework2;

public class FigurePainter2 {

        public static void main(String[] args) {
            /* 1.
             * * * *
             * * *
             * *
             *
             */


//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" *");
//            }
//
//            System.out.println();
//        }


//        ----------------------------------------------------------------------

     /*
      2.
               *
              * *
             * * *
            * * * *
             * * *
              * *
               *

      */

            for (int i = 0; i < 4; i++) {
                for (int j = 4 - i; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }


            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i + 2; j++) {
                    System.out.print(" ");

                }
                for (int j = 3 - i; j > 0; j--) {
                    System.out.print("* ");
                }

                System.out.println();
            }


        }
    }


