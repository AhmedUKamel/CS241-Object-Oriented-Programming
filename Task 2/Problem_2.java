import java.util.Scanner;
public class Problem_2 {
    public static void main(String[] args){

        System.out.print("Enter a word = ");           // prompt the user to enter an input
        String input = new Scanner(System.in).next();  // receive the input

        int len = input.length();                      // calculate the length
        char last = input.charAt(len-1);               // get last character

        System.out.println("The length of " + input + " = " + len);
        System.out.println("The last of " + input + " = " + last);

    }
}
