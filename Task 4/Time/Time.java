package Time;
public class Time {
    private int hour;  
    private int minute;  
    private int second;
    
    // Constructors
    public Time(int h, int m, int s){
        if (h < 24 && h > 0) hour = h;
        else System.out.println("Invalid range of hour");
        if (m < 60 && m > 0) minute = m;
        else System.out.println("Invalid range of minute");
        if (s < 60 && s > 0) second = s;
        else System.out.println("Invalid range of second");
    }

    // Setters
    public void setHour(int h){
        if (h < 24 && h > 0) hour = h;
        else System.out.println("Invalid range of hour");
    }

    public void setMinute(int m){
        if (m < 60 && m > 0) minute = m;
        else System.out.println("Invalid range of minute");
    }

    public void setSecond(int s){
        if (s < 60 && s > 0) second = s;
        else System.out.println("Invalid range of second");
    }

    public void setTime(int h, int m, int s){
        if (h < 24 && h > 0) hour = h;
        else System.out.println("Invalid range of hour");
        if (m < 60 && m > 0) minute = m;
        else System.out.println("Invalid range of minute");
        if (s < 60 && s > 0) second = s;
        else System.out.println("Invalid range of second");
    }
    
    // Getters
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    // Other Methods
    public String toString(){
        String time = null;

        if (hour < 10) time = ( "0" + String.valueOf(hour) );
        else time = String.valueOf(hour);

        if (minute < 10) time += ( ":0" + String.valueOf(minute) );
        else time += ( ":" + String.valueOf(minute) );

        if (second < 10) time += ( ":0" + String.valueOf(second) );
        else time += ( ":" + String.valueOf(second) );

        return time;
    }

    public Time nextSecond(){
        return new Time(hour, minute, second+1);
    }

    public Time previousSecond(){
        return new Time(hour, minute, second-1);
    }

    // Main Class
    public static void main(String[] args){
        Time t = new Time(5, 9, 35);
        System.out.println("Time : " + t.toString());

        System.out.println("After 2 seconde : " + t.nextSecond().nextSecond().toString());
    }
}