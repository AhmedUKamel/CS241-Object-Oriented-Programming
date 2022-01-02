package Account;
import java.time.LocalDate;
public class Account {
    private int ID;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;

    // Constructors
    public Account() {
        ID = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = LocalDate.now();
    }
    
    public Account(int i, double b) {
        ID = i;
        balance = b;
        annualInterestRate = 0;
        dateCreated = LocalDate.now();
    }

    // Setters
    public void setID(int i){
        ID = i;
    }

    public void setBalance(double b){
        balance = b;
    }

    public void setAnnualInterestRate(double a){
        annualInterestRate = ( a / 100 );
    }

    // Getters
    public int getID(){
        return ID;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return ( annualInterestRate * 100 );
    }

    public LocalDate getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return ( annualInterestRate / 12 ) * 100;
    }

    public double getMonthlyInterest(){
        return (balance * ( annualInterestRate / 12 ));
    }

    // Other Methods
    public void withdraw(double w){
        if (w < balance) balance -= w;
        else System.out.println("Debit amount exceeded account balance");
    }

    public void deposit(double d){
        balance += d;
    }

    // Main
    public static void main(String[] args){
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println("Balance : " + a.getBalance());
        System.out.println("Monthly interest : " + a.getMonthlyInterest());
        System.out.println("Account was created : " + a.getDateCreated());
    }
}