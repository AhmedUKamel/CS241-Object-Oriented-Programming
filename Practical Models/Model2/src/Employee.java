public class Employee extends Person {
    public String job;
    public double salary;

    // Constructors
    public Employee(String name, String add, int age ,double salary, String job) {
        super(name, add, age);
        this.salary = salary;
        this.job = job;
    }

    public Employee() {}

    // Getters
    public double getSalary() {
        return salary;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String getName() {
        return name;
    }

    // Setters
    public final void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJob(String job) {
        this.job = job;
    }
}