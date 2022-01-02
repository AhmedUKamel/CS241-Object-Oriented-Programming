import java.util.Scanner;
public class Problem_16 {
    public static void main(String[] args){

        System.out.print("Enter decimal number = ");
        int number = new Scanner(System.in).nextInt();

        String binary = "";

        while (number != 0){

            binary = String.valueOf(number%2) + binary;
            number /= 2;

        }
        System.out.println("Binary = " + binary);
    }
}
