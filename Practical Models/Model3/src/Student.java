public class Student extends Person {
    public int level;
    public double gpa;

    // Constructors
    public Student() {}

    public Student(String name, String add, int age , int level, double gpa) {
        super(name, add, age);
        this.level = level;
        this.gpa = gpa;
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }
 
    public int getLevel() {
        return this.level;
    }
    /*
    Ans1:
    replace public int getLevel() {
                return this.level;
            }
    with    public static int getLevel(Student s) {
                return s.level;
            }
    */

    public double getGpa() {
        return this.gpa;
    }
}