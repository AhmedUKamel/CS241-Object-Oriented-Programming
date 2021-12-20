import java.util.Scanner;
public class problem_13 {
    public static void main(String[] args){

        // Get number
        System.out.print("Enter number : ");
        int number = new Scanner(System.in).nextInt();

        // Copy the number to compare with it finally
        int copy = number, inverse = 0;

        // Get inverse for number
        while (copy != 0){
            inverse*= 10;
            inverse+= copy % 10;
            copy/= 10;
        }

        // Compare after with before
        if (number == inverse) System.out.println(number + " = " + inverse + ", so it\'s palindrome");
        else                   System.out.println(number + " != " + inverse + ", so it\'s not palindrome");
    }
}