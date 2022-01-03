public class Salaried_Employee  extends Employee {
    public double Bonus;
    public double Deductions;

    // Constructors
    public Salaried_Employee() {
    }

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

    // Q2: Override getSalary_Method (Employee Class) ,To adjust the salary, add Bonus, and deduct Deductions.

    /*
    Ans2:
    Add     @Override
            public double getSalary(){
                return (salary + Bonus - Deductions);
            }
    */

    // End of Question.
}