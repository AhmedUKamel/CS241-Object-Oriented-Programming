public class Dog {
    private String name;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }

    /*
    Ans1:
    Add     extends Animal to public class Dog
    And     @Override
            public void speak() {
                System.out.print("woof");
            }

            @Override
            public void eat() {
                System.out.print("num num");
            }
    */

    // Q2: Add an equals method to this class that returns true if the current Dog and passed Dog have the same name. The code should print false twice then true twice.
    
    
    /*
    Ans2:
    Add     public boolean equals(Dog dog){
                if(dog.name==this.name)
                    return true;
                else
                    return false;
            }
    */
    
    //End of Question 2
}