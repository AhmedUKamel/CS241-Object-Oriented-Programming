import java.util.Scanner;
public class Main {
    public static void main(String...args){
        // prompts the user to enter name
        System.out.print("Enter your name : ");
        String name = new Scanner(System.in).nextLine();

        // print hi
        System.out.println("Hi " + name + ", Welcome to JAVA");
    }
}
/*
Write a java program to ask the user to enter his/her name and print
welcome message. For example if the user enters ‘Ahmed’ as his name the
program should print “Hi Ahmed, Welcome to JAVA".
*/