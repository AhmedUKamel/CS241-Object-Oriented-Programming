public class Problem_15 {
    public static void main(String[] args){

        double sum = 0;
        for (double i = 1 ; i <= 97; i+=2){
            sum += i/(i+2);
        }
        System.out.println("Sum of 1/3 + 3/5 + ... + 97/99 = " + sum);
    }
}
