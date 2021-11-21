import java.util.Scanner;
public class Problem_7{
 
    public static void main(String[] args) {
        System.out.print("Enter a Password : ");
        String password = new Scanner(System.in).next();
        
        if (isValidPassword(password)) System.out.println("Valid");
        else System.out.println("Invalid");
    }
 
    public static boolean isValidPassword(String password)
    {
        boolean con1 = false, con2 = false, con3 = false;
        char[] pass = password.toCharArray();
        
        // check condition 1
        int counter = 0;
        for (char ch : pass){
            if (Character.isLetter(ch)) counter++;
        }
        if (counter >= 10) con1 = true;
        
        // check condition 2
        for (char ch : pass){
            if (Character.isLetter(ch)) con2 = true;
            else {
                if (ch == 48 || ch == 49 || ch == 50 || ch == 51 || ch == 52 || ch == 53 || ch == 54 || ch == 55 || ch == 56 || ch == 57){
                    con2 = true;
                }
                else {
                    break;
                }
            }
        }
        
        // check condition 3
        int counter2 = 0;
        for (char ch : pass){
            if (ch == 48 || ch == 49 || ch == 50 || ch == 51 || ch == 52 || ch == 53 || ch == 54 || ch == 55 || ch == 56 || ch == 57){
                counter2++;
            }
        }
        if (counter2 >= 3) con3 = true;

        if (con1 && con2 && con3) return true;
        else return false;
    }
}