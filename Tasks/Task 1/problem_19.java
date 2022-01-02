import java.util.Scanner;
public class problem_19 {
    public static void main(String[] args){

        // Print note for user
        System.out.println("0 > single filer");
        System.out.println("1 > married jointly or qualifying widow (er)");
        System.out.println("2 > married separately");
        System.out.println("3 > head of household");

        // Get filing status
        System.out.print("Enter your filing status : ");
        int status = new Scanner(System.in).nextInt();
        
        // Get taxable income
        System.out.print("Enter your taxable income : ");
        double income = new Scanner(System.in).nextDouble();

        // Calculate tax
        if (status == 0){
            if (income > 0 && income <= 8350)              System.out.println("Your tax is 10 % of " + income + " = " + income*0.1);
            else if (income >= 8351 && income <= 33950)    System.out.println("Yout tax is 15 % of " + income + " = " + income*0.15);
            else if (income >= 33951 && income <= 82250)   System.out.println("Yout tax is 25 % of " + income + " = " + income*0.25);
            else if (income >= 82251 && income <= 171550)  System.out.println("Yout tax is 28 % of " + income + " = " + income*0.28);
            else if (income >= 171551 && income <= 372950) System.out.println("Yout tax is 33 % of " + income + " = " + income*0.33);
            else if (income >= 372951)                     System.out.println("Yout tax is 35 % of " + income + " = " + income*0.35);
        }
        else if (status == 1){
            if (income > 0 && income <= 16700)             System.out.println("Your tax is 10 % of " + income + " = " + income*0.1);
            else if (income >= 16701 && income <= 67900)   System.out.println("Yout tax is 15 % of " + income + " = " + income*0.15);
            else if (income >= 67901 && income <= 137050)  System.out.println("Yout tax is 25 % of " + income + " = " + income*0.25);
            else if (income >= 137051 && income <= 208850) System.out.println("Yout tax is 28 % of " + income + " = " + income*0.28);
            else if (income >= 208851 && income <= 372950) System.out.println("Yout tax is 33 % of " + income + " = " + income*0.33);
            else if (income >= 372951)                     System.out.println("Yout tax is 35 % of " + income + " = " + income*0.35);
        }
        else if (status == 2){
            if (income > 0 && income <= 8350)              System.out.println("Your tax is 10 % of " + income + " = " + income*0.1);
            else if (income >= 8351 && income <= 33950)    System.out.println("Yout tax is 15 % of " + income + " = " + income*0.15);
            else if (income >= 33951 && income <= 68525)   System.out.println("Yout tax is 25 % of " + income + " = " + income*0.25);
            else if (income >= 68526 && income <= 104425)  System.out.println("Yout tax is 28 % of " + income + " = " + income*0.28);
            else if (income >= 104426 && income <= 186475) System.out.println("Yout tax is 33 % of " + income + " = " + income*0.33);
            else if (income >= 186476)                     System.out.println("Yout tax is 35 % of " + income + " = " + income*0.35);
        }
        else if (status == 3){
            if (income > 0 && income <= 11950)             System.out.println("Your tax is 10 % of " + income + " = " + income*0.1);
            else if (income >= 11951 && income <= 45500)   System.out.println("Yout tax is 15 % of " + income + " = " + income*0.15);
            else if (income >= 45501 && income <= 117450)  System.out.println("Yout tax is 25 % of " + income + " = " + income*0.25);
            else if (income >= 117451 && income <= 190200) System.out.println("Yout tax is 28 % of " + income + " = " + income*0.28);
            else if (income >= 190201 && income <= 372950) System.out.println("Yout tax is 33 % of " + income + " = " + income*0.33);
            else if (income >= 372951)                     System.out.println("Yout tax is 35 % of " + income + " = " + income*0.35);
        }
        else                                               System.out.println("Invalid input \"" + status + "\"");
    }
}