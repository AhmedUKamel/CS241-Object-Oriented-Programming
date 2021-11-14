import java.util.Scanner;
class Problem_4 {
    public static void main(String[] args){

        System.out.print("Enter Super String = ");         // prompt the user to enter a value
        String str1 = new Scanner(System.in).next();       // receive the input


        System.out.print("Enter SubString = ");            // prompt the user to enter a value
        String str2 = new Scanner(System.in).next();       // receive the input

        int len1 = str1.length();                          // calculate length 1
        int len2 = str2.length();                          // calculate length 2
        boolean is_sub = false;                            // flag
        int start = 0, end = len2;

        while (end <= len1){
            if (str2.equals(str1.substring(start, end))){
                is_sub = true;
                break;
            }
            else{
                start ++;
                end ++;
            }
        }

        if (is_sub == true) System.out.println(str2 + " is substring of " + str1);
        else System.out.println(str2 + " is not substring of " + str1);
    }
}
