import java.util.Scanner;
public class Problem_9{
 
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String s1 = new Scanner(System.in).next();
        
        System.out.print("Enter Character : ");
        char s2 = new Scanner(System.in).next().charAt(0);
        
        System.out.print("Cccurrences of " + s2 + " = " + count(s1, s2));

    }
 
    public static int count(String str, char a){
        char[] s = str.toCharArray();
        int counter = 0;
        
        for (char i : s){
            if (i == a) counter ++;
        }
        
        return counter;
    }
}