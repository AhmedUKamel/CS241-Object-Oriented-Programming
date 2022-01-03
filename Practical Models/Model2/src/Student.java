public class Student extends Person {
    public int level;
    public double gpa;
    public static int num_of_object;

    // Constructors
    public Student() {}

    public Student(String name, String add, int age , int level, double gpa) {
        super(name, add, age);
        this.level = level;
        this.gpa = gpa;
        num_of_object++;
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }

    public  int getLevel() {
        return level;
    }

    public double getGpa() {
        return gpa;
    }

    /*
    Ans1:
    Add     public static int num_of_objects(){
                return num_of_object;
            }
    */
}