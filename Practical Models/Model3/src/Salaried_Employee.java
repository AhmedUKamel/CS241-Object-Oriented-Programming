public class Salaried_Employee  extends Employee {
    public double Bonus;
    public double Deductions;

    // Constructors
    public Salaried_Employee() {}

    public Salaried_Employee(String name, String add, int age, double salary, String job ,double Bonus, double Deductions) {
        super(name, add, age, salary, job);
        this.Bonus = Bonus;
        this.Deductions = Deductions;
    }

    // Getters
    public double getBonus() {
        return Bonus;
    }

    public double getDeductions() {
        return Deductions;
    }
}