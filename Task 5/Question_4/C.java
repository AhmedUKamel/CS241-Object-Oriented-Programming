package Question_4;
public class C {
    // Main
    public static void main(String[] args){
        B b = new B();
    }
}

/*
Part a 
Output: A's no-arg constructor is invoked
Reason: 
A class has a constructor, which print the statement.
B class has no constructors.
C class has main function, 
which create an Object from class B, And B inherits A.
B's default empty constructor invokes the Super's empty constructor (A).

Part b
Error: Implicit super constructor A() is undefined. 
Must explicitly invoke another constructor.
*/