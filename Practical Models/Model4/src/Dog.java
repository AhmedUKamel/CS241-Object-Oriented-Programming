public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /*
    Ans3:
    Add     extends Animal to public class Dog
    And     public Dog(){}

            @Override
            public void speak() {
                System.out.println("woof");
            }

            @Override
            public void eat() {
                System.out.println("num num");
            }
    */

    // Q2: Add an equals method to this class that returns true if the current Dog and passed Dog have the same name. The code should print false twice then true twice.

    /*
    Ans2:
    Add     public boolean equals(Dog dog){
                return this.name == dog.name;
            }
    */

    // End of Question 2
}