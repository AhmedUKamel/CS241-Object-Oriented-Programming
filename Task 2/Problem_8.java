public class Problem_8 {
    public static void main(String[] args){

        System.out.println("Celsius\tFahrenheit");

        for (int i = 0 ; i <= 100 ; i+=2)
            System.out.println(i + "\t" + (i*(9/5f) + 32));

    }
}
