import java.util.Scanner;
class Problem_5{
    public static void main(String[] args){

        System.out.println("Please, be noted that \nSSD must be in form DDD-DD-DDDD");
        System.out.print("Enter your SSN = ");
        String ssn = new Scanner(System.in).next();

        if (ssn.length() > 11 || ssn.length() < 11){
            System.out.println("Invalid length");
        }
        else{
            if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-'){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
