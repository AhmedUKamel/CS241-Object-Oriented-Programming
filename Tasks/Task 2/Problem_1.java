import java.util.Scanner;
class Problem_1{
    public static void main(String[] args){

        System.out.print("Enter a character = ");                  // prompt the user to enter an input
        char char1 = new Scanner(System.in).next().charAt(0);      // receive the input

        System.out.println(char1 + " in Ascii = " + (int)char1);   // print the output
    }
}