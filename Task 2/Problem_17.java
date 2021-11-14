import java.util.Scanner;
public class Problem_17 {
    public static void main(String[] args){

        System.out.print("Enter a word = ");
        String str = new Scanner(System.in).next();

        String reverse = "";

        for (int i = str.length()-1 ; i >= 0; i--){
            reverse += str.charAt(i);
        }

        System.out.println("Reverse = " + reverse);
    }
}
