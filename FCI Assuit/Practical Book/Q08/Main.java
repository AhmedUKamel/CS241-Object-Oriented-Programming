public class Main {
    public static void main(String... args) {
        // print the 1st 10 numbers  in series
        for(int i = 1; i <= 10; i++){
            if(i!=10) System.out.print(getFibonacci(i) + ", ");
            else System.out.print(getFibonacci(i) + ".");
        }
    }

    public static int getFibonacci(int index){
        if(index==1) return 0;
        else if(index==2) return 1;
        else return getFibonacci(index-1)+getFibonacci(index-2);
    }
}
/*
Write a java program to print the first 10 numbers in Fibonacci series. By
definition, the first two numbers in the Fibonacci sequence are 0 and 1, and
each subsequent number is the sum of the previous two.
*/