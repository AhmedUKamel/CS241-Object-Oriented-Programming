package firstPackage;
import secondPackage.*;
public class Student extends Person {
    private double gpa;
    protected int code;
    int level;
    public String specialization;

    // Constructors
    public Student(){

    }
    
    protected Student(double g, int c, int l, String s){
        this.gpa = g;
        this.code  = c;
        this.level = l;
        this.specialization = s;
    }

    // Setters
    public void setGPA(double g){
        this.gpa  = g;
    }

    public void setCode(int c){
        this.code = c;
    }

    public void setLevel(int l){
        this.level = l;
    }

    public void setSpecialization(String s){
        this.specialization = s;
    }

    // Getters
    protected static double getGPA(Student student){
        return student.gpa;
    }

    protected static int getCode(Student student){
        return student.code;
    }

    protected static int getLevel(Student student){
        return student.level;
    }

    protected static String getSpecialization(Student student){
        return student.specialization;
    }

    // Other Methods
    public static Student addStudentOnlyINFO(double g, int c, int l, String s){
        return new Student(g, c, l, s);
    }

    public static Student addStudentAndPerson(String n, String a, double s, String g, double t, double g2, int c, int l, String s2){
        Student student = new Student();
        student.setName(n);
        student.setAddress(a);
        student.setSalary(s);
        student.setGender(g);
        student.setTall(t);
        student.setGPA(g2);
        student.setCode(c);
        student.setSpecialization(s2);
        return student;
    }

    public static Student clonePersonIntoStudent(Person p){
        Student student = new Student();
        student.setName(p.getName());
        student.setAddress(p.getAddress());
        student.setSalary(p.getSalary());
        student.setGender(p.getGender());
        student.setTall(p.getTall());
        return student;
    }

    public static void editPerson(Person person, String n){
        person.setName(n);
    }

    public static void editPerson(Person person, String n, String a){
        person.setName(n);
        person.setAddress(a);
    }

    public static void editPerson(Person person, String n, String a, double s){
        person.setName(n);
        person.setAddress(a);
        person.setSalary(s);
    }

    public static void editPerson(Person person, String n, String a, double s, String g){
        person.setName(n);
        person.setAddress(a);
        person.setSalary(s);
        person.setGender(g);
    }

    public static void editPerson(Person person, String n, String a, double s, String g, double t){
        person.setName(n);
        person.setAddress(a);
        person.setSalary(s);
        person.setGender(g);
        person.setTall(t);
    }

    @Override
    public String toString(){
        return  super.toString() + 
                "\nGPA : " + this.gpa +
                "\nCode : " + this.code +
                "\nLevel : " + this.level +
                "\nSpecialization : " + this.specialization;
    }
}
/*
> In this class you can:
 *  Create an empty Object (Student()) from any Package or class.
 *  Create an non-empty Object from only this package.
 *  Set any value from any Package.
 *  Get any value from only this package.
 *  Use any Methods under 'Other Methods' from any package.
**/