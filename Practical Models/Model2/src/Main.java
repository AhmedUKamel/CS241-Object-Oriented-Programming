public class Main {
    public static void main(String[] args) {
        // Q1: Create num_of_objects print number of objects from Student Class.

        // Test program that creates three Student objects (On Q1).
        Student s1 = new Student("Muhammad" , "Beni-Suef" ,20,2,3.7);
        Student S2 = new Student();
        Student S3 = new Student();
        System.out.println("Name of Student 1 : " + s1.getName()+ " Add of S1 :  " + s1.getAdd() + " Age of s1:" + s1.getAge() + " Level of s1 : " + s1.getLevel());

        /*
        Ans1:
        Add     System.out.println(Student.num_of_objects());
        */

        // End of Question.
    }
}