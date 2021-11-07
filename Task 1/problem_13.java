import java.util.Scanner;
public class problem_13 {
    public static void main(String[] args){

        System.out.print("Enter number = ");
        int number = new Scanner(System.in).nextInt();

        int copy = number, inverse = 0;

        while (copy != 0){
            inverse*= 10;
            inverse+= copy % 10;
            copy/= 10;
        }

        if (number == inverse) System.out.println(number + " = " + inverse + ", so it\'s palindrome");
        else                   System.out.println(number + " != " + inverse + ", so it\'s not palindrome");
    }
}