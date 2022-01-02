package Question_2;
public class Student extends Person {
    private final String class_status;

    // Constructors
    public Student(String c){
        this.class_status = c;
    }

    public Student(String n, String a, String p, String e, String c){
        super(n, a, p, e);
        this.class_status = c;
    }
    
    // Setters
    /*  
        There's no Empty constructor or setter because..
        The field class_status is final (Constant), 
        So user must enter value for it
    */

    // Getters
    public String getClassStatus(){
        return this.class_status;
    }

    // Other Methods
    @Override
    public String toString(){
        return  super.toString() + 
            "\nClass Status : " + this.class_status;
    }
}