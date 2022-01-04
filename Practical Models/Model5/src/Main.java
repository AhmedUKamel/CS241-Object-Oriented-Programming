public class Main {
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
    
    // Q2: Overload the greet method to just print “Hello” if not given any parameters. It should print “Hello” and then “Hello Ahmed”.

    /*
    Ans2:
    Add     public static void greet() {
                System.out.println("Hello");
            }
    */
    
    //End of Question 2 
    public static void main(String[] args) {
        //test Question 1 
        greet();
        greet("Ahmed");
        
        // test Question 2 
        Candy c1 = new Candy(); // --> Invalid because Candy is abstract class, but dr who typed the test cases
        System.out.println(c1.taste());
        Candy c2 = new Chocolate();
        System.out.println(c2.taste());
    }
}