package Exercise_5;
public class Number {
    private int value;

    // Constructors
    public Number(){
    }

    public Number(int v){
        this.value = v;
    }

    // Setter
    public static void setValue(Number n, int v){
        n.value = v;
    }

    public static void setValue(int n, int v){
        n = v;
    }

    // Getters
    public static int getValue(Number n){
        return n.value;
    }

    public static int getValue(int n){
        return n;
    }

    // Other Methods
    public static String toString(Number n){
        return "Number : " + n.value;
    }

    public static String toString(int n){
        return "Number : " + n;
    }

    public static String toString(Number n1, Number n2){
        return  "Number1 : " + n1.value +
                "\nNumber2 : " + n2.value;
    }

    public static String toString(int n1, int n2){
        return  "Number1 : " + n1 +
                "\nNumber2 : " + n2 ;
    }

    public static void Factorial(Number n){
        int fac = 1;
        while(n.value != 1){
            fac *= n.value;
            n.value--;
        }
        n.value = fac;
    }

    public static void Factorial(int n){
        int fac = 1;
        while(n != 1){
            fac *= n;
            n--;
        }
        n = fac;
    }

    public static void Square(Number n){
        n.value *= n.value;
    }

    public static void Square(int n){
        n *= n;
    }

    public static Number addNumbers(Number n1, Number n2){
        return new Number(n1.value + n2.value);
    }

    public static Number addNumbers(int n1, int n2){
        return new Number(n1 + n2);
    }
}