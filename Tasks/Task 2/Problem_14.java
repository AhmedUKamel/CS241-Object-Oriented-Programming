public class Problem_14 {
    public static void main(String[] args){

        // pattern A
        System.out.println("Pattern A");
        for (int row = 1; row<= 6; row++){
            for (int column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern B
        System.out.println("Pattern B");
        for (int row = 6; row>= 1; row--){
            for (int column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern C
        System.out.println("Pattern C");
        for (int row = 1; row<= 6; row++){

            for (int space = 1; space <= 6-row; space++){
                System.out.print(" ");
            }

            for (int column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern D
        System.out.println("Pattern D");
        for (int row = 1; row<= 6; row++){
            for (int column = 1; column <= row; column++){
                System.out.print(" ");
            }

            for (int column = 1; column <= 6-row; column++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
