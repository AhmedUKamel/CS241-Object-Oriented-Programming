import java.util.Scanner;
public class Main {
    public static void main(String... args) {
        // prompts user to enter three numbers
        double[] numbers = new double[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            numbers[i] = new Scanner(System.in).nextDouble();
        }

        // sort giving number and print them
        ascSort(numbers);
        for(double n : numbers) System.out.print(n + " ");
    }

    public static void ascSort(double[] n){
        for(int i = 0; i < n.length-1; i++){
            for(int j = 0; j < n.length-1; j++){
                if(n[j]>n[j+1]){
                    double temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
    }
}
/*
Write a program that asks the user to enter three integers and prints them
in ascending order.
*/