import java.util.Scanner;
class Problem_3{
    public static void main(String[] args){

        System.out.print("Enter binary number = ");         // prompt the user to enter value
        int bin = new Scanner(System.in).nextInt();         // receive the input

        int dec = 0, base = 1;                              // convert process
        while (bin != 0){
            dec += (bin % 10) * base;
            bin /= 10;
            base *= 2;
        }

        System.out.println("Decimal = " + dec);              // print the output
    }
}