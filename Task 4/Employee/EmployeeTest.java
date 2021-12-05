package Employee;
public class EmployeeTest {
    public static void main(String[] args){
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Ahmed", "Hatem", 15000);
        employees[1] = new Employee("Ahmed", "Ali", 2000);
        employees[2] = new Employee("Ahmed", "Mohammed", 9000);
        employees[3] = new Employee("Ahmed", "Kamel", 8700);
        employees[4] = new Employee("Ahmed", "Mahmoud", 7500);
        employees[5] = new Employee("Ahmed", "Fathy", 6400);
        employees[6] = new Employee("Ahmed", "Khaled", 8200);
        employees[7] = new Employee("Ahmed", "Mostafa", 6900);
        employees[8] = new Employee("Ahmed", "Hassan", 3400);
        employees[9] = new Employee("Ahmed", "Kareem", 4900);

        // Print before raise salary
        System.out.println("Before raising salary : ");
        for (int i = 0; i < 10; i++){
            System.out.println(employees[i].getFirstName() + " " + employees[i].getLastName() + "\t take " + (employees[i].getMonthlySalary() * 12));
        }
        
        // Raise salary then print new value
        System.out.println("\nAfter raising salary 10% : ");
        for (int i = 0; i < 10; i++){
            employees[i].setMonthlySalary(employees[i].getMonthlySalary() * 1.1);
            System.out.println(employees[i].getFirstName() + " " + employees[i].getLastName() + "\t take " + (employees[i].getMonthlySalary() * 12));
        }
    }
}
