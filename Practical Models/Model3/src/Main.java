public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Muhammad" , "Beni-Suef" ,20,2,3.7);

        // Q1: In order to call the function through the class, not through the objects ,correct the error.
        System.out.println(s1.getLevel());

        /*
        Ans1:
        replace     System.out.println(s1.getLevel());
        with        System.out.println(Student.getLevel(s1));
        */

        // End of Question 1
    }
}