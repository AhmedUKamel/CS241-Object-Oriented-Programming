import java.util.Scanner;
public class problem_20 {
    public static void main(String[] args){

        System.out.print("Enter year (ex: 2012) = ");                            // ask user for year
        int year = new Scanner(System.in).nextInt();                             // entr year
        if (year <= 0)                                                           // check if valid
            throw new java.lang.Error(year + " can\'t be negative");             // case invalid

        System.out.print("Enter month (1 - 12) = ");                             // ask user for month
        int m = new Scanner(System.in).nextInt();                                // enter month
        if (m > 12 || m < 0)                                                     // check if valid
            throw new java.lang.Error("Only (1 - 12) allowed !");                // case invalid
        if (m == 2)                                                              // set the range
            System.out.print("Enter the day of month (1 - 28) = ");              // ask user for day
        else if (m == 4 || m == 6 || m == 9 || m == 11)                          // set the range
            System.out.print("Enter the day of month (1 - 30) = ");              // ask user for day
        else                                                                     // set the range
            System.out.print("Enter the day of month (1 - 31) = ");              // ask user for day

        int q = new Scanner(System.in).nextInt();                                // enter day
        if (m == 2)                                                              // check month
            if (q < 1 || q > 28)                                                 // check the range
                throw new java.lang.Error("Out of range, only (1 - 28) allowed");// case out of range
        else if (m == 4 || m == 6 || m == 9 || m == 11)                          // check month
            if (q < 1 || q > 30)                                                 // check the range
                throw new java.lang.Error("Out of range, only (1 - 30) allowed");// case out of range
        else                                                                     // check month
            if (q < 1 || q > 31)                                                 // check the range
                throw new java.lang.Error("Out of range, only (1 - 31) allowed");// case out of range

        int j = year / 100, k = year % 100;                                      // declear j and k
        int h = (q + ((26*(m + 1))/10) + k + k/4 + j/4 + 5*j) % 7;               // get day by equation

        switch (h){                                                              // switch on day
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday");   break;
            case 2: System.out.println("Monday");   break;
            case 3: System.out.println("Tuesday");  break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");   break;
        }
    }
}