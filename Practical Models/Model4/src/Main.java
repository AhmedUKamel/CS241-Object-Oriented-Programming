public class Main {
    public static void talk() {
          System.out.println("hello there!");
    }

    // Q1: Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.

    /*
    Ans1:
    Add     public static void talk(String name) {
                System.out.println("hello " + name);
            }
    */

    //End of Question1
   
    public static void main(String[] args) {
        // test of Question1
        talk("Matthew");
     
        //test of Question2
        Dog d1 = new Dog("Rufus");
        Dog d2 = new Dog("Sally");
        Dog d3 = new Dog("Rufus");
        Dog d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));

        // test of Question 3
        Dog myDog = new Dog();
        myDog.speak();
        myDog.eat();
    }
}