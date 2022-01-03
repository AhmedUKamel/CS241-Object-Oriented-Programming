public class Hourly_Employee extends Employee {
    public double Working_Hour;
    public double Hour_Rate;

    // Constructors
    public Hourly_Employee() {}

    public Hourly_Employee(String name, String add, int age, double salary, String job ,double Working_Hour, double Hour_Rate) {
        super(name, add, age, salary, job);
        this.Working_Hour = Working_Hour;
        this.Hour_Rate = Hour_Rate;
    }

    // Getters
    public double getWorking_Hour() {
        return Working_Hour;
    }

    public double getHour_Rate() {
        return Hour_Rate;
    }

    // Q2: Override getSalary_Method (Employee Class) ,To adjust the salary, multiply Working_Hour * Hour_Rate.

    /*
    Ans2:
    Type    @Override
            public double getSalary(){
                return Working_Hour * Hour_Rate;
            }
    */

    // End of Question.
}