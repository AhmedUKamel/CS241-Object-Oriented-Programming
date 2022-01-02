import java.util.Scanner;
public class Problem_12 {
    public static void main(String[] args){

        // counts of all numbers
        int count1 = 0, count2 = 0, count3 = 0;
        int count4 = 0, count5 = 0, count6 = 0;
        int count7 = 0, count8 = 0, count9 = 0;

        boolean flag = true;
        while (flag == true){

            System.out.print("Enter a number = ");
            int num = new Scanner(System.in).nextInt();

            switch(num){
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
                case 8:
                    count8++;
                    break;
                case 9:
                    count9++;
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }

        if (count9 != 0){
            System.out.println("9 is the largest number and it\'s occurrences = " + count9);
        }
        else{
            if (count8 != 0){
                System.out.println("8 is the largest number and it\'s occurrences = " + count8);
            }
            else{
                if (count7 != 0){
                    System.out.println("7 is the largest number and it\'s occurrences = " + count7);
                }
                else{
                    if (count6 != 0){
                        System.out.println("6 is the largest number and it\'s occurrences = " + count6);
                    }
                    else{
                        if (count5 != 0){
                            System.out.println("5 is the largest number and it\'s occurrences = " + count5);
                        }
                        else{
                            if (count4 != 0){
                                System.out.println("4 is the largest number and it\'s occurrences = " + count4);
                            }
                            else{
                                if (count3 != 0){
                                    System.out.println("3 is the largest number and it\'s occurrences = " + count3);
                                }
                                else{
                                    if (count2 != 0){
                                        System.out.println("2 is the largest number and it\'s occurrences = " + count2);
                                    }
                                    else{
                                        if (count1 != 0){
                                            System.out.println("1 is the largest number and it\'s occurrences = " + count1);
                                        }
                                        else{
                                            System.out.println("No numbers entered");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}