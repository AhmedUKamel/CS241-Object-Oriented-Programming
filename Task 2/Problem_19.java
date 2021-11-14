import java.util.Scanner;
public class Problem_19 {
    public static void main(String[] args){

        System.out.print("Enter a string = ");
        String str = new Scanner(System.in).nextLine();

        int vowels = 0,  spaces = 0, len = str.length(), consonants;

        for (int i = 0 ; i < len; i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowels++;
            }
            else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                vowels++;
            }
            else if (str.charAt(i) == ' '){
                spaces++;
            }
        }

        consonants = len - vowels - spaces;

        System.out.println("Total characters = " + len);
        System.out.println("Total vowels = " + vowels);
        System.out.println("Total consonants = " + consonants);
    }
}
