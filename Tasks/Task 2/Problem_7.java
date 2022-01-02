public class Problem_7 {
    public static void main(String[] args){

        double first = 10000, tenth = 0, total_4 = 0;

        for (int i = 1 ; i <= 14 ; i++){

            first *= 1.06;
            System.out.println(first);

            if (i == 10){
                tenth = first;
            }
            else if (i > 10){
                total_4 += first;
            }
        }

        System.out.println("The cost of year 10 = " + tenth);
        System.out.println("The cost of 4 years after year 10 (11-14) = " + total_4);
    }
}
