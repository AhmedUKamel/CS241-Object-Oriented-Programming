public class Problem_10 {
    public static void main(String[] args){

        System.out.println("All numbers divisible 3 and 4 from 100 to 1.000 are : ");

        int counter=0;                        // just for design
        for (int i = 100 ; i <= 1000 ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print(i + " ");


                counter++;
                if (counter % 15 == 0)        // additional step
                    System.out.println();
            }
        }
    }
}
