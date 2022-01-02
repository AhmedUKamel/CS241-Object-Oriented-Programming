import java.util.Scanner;
public class Problem_18 {
    public static void main(String[] args){

        System.out.print("Enter the first string = ");
        String str1 = new Scanner(System.in).nextLine();

        System.out.print("Enter the second string = ");
        String str2 = new Scanner(System.in).nextLine();

        int len;
        if (str1.length()>str2.length()){
            len = str2.length();
        }
        else{
            len = str1.length();
        }

        String common = "";
        boolean flag = false;
        for (int i = 0 ; i < len ; i++){

            if (str1.charAt(i)==str2.charAt(i)){
                common += str1.charAt(i);
                flag = true;
            }
        }

        if (flag == true){
            System.out.println("The the common prefix = " + common);
        }
        else{
            System.out.println("No common prefix found");
        }
    }
}
