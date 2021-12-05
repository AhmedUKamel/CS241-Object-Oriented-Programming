package MyDate;
public class MyDate{
    int day;
    int month;
    int year;

    // Constructor
    public MyDate(int d, int m, int y){
        if (d <= 31) day = d;
        else System.out.println("Day can\'t be greater than 31");
        if (m <= 12) month = m;
        else System.out.println("Month can\'t be greater than 12");
        if (y <= 2021) year = y;
        else System.out.println("Year can\'t be greater than 2021");
    }

    // Setters
    public void setDay(int d){
        if (d <= 31) day = d;
        else System.out.println("Day can\'t be greater than 31");
    }

    public void setMonth(int m){
        if (m <= 12) month = m;
        else System.out.println("Month can\'t be greater than 12");
    }

    public void setYear(int y){
        if (y <= 2021) year = y;
        else System.out.println("Year can\'t be greater than 2021");
    }

    // Getters
    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    // Other Methods
    public void displayDate(){
        System.out.println(month+ "/" + day + "/" + year);
    }

    // Main
    public static void main(String[] args){
        MyDate d1 = new MyDate(3, 5, 2016);
        d1.displayDate();

        d1.setDay(25);
        d1.setMonth(10);
        d1.setYear(2020);
        d1.displayDate();

        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
    }
}