import java.util.Scanner;
public class Main {
    public static void main(String... args) {
        // prompts user to enter first number
        System.out.print("Enter first  value : ");
        String v1 = new Scanner(System.in).next();
        // prompts user to enter second number
        System.out.print("Enter second value : ");
        String v2 = new Scanner(System.in).next();
        // put two variables in array and invoke swapFun then return values to variables
        String[] list = {v1, v2};
        swapFun(list);
        v1 = list[0];
        v2 = list[1];
        // print values after swap
        System.out.println("First  : " + v1 + "\nSecond : " + v2);
    }

    public static void swapFun(String[] strs){
        String temp = strs[0];
        strs[0] = strs[1];
        strs[1] = temp;
    }
}
/*
Write a program that contains a function which takes two numbers x, and
y and the function swap these numbers.
*/