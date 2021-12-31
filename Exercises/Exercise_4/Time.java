public class Time {
    private int hour;  
    private int minute;  
    private int second;
    
    // Constructors
    public Time(){

    }

    public Time(int h, int m, int s){
        if (h < 24 && h >= 0) hour = h;
        else System.out.println("Invalid range of hour");
        if (m < 60 && m >= 0) minute = m;
        else System.out.println("Invalid range of minute");
        if (s < 60 && s >= 0) second = s;
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
        else if (h >= 24) this.hour = h % 24;
        else this.hour = h + 24;
        if (m < 60 && m > 0) minute = m;
        else if (m >= 60) {this.setTime(this.hour+1, this.minute, this.second); this.minute = m % 60;}
        else {this.minute = m + 60; this.hour--;}
        if (s < 60 && s > 0) second = s;
        else if (s >= 60) {this.setTime(this.hour, this.minute+1, this.second); this.second = s % 60;}
        else {this.second = s + 60; this.minute--;}
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

    public static void nextSecond(Time t){
        t.setSecond(t.getSecond()+1);
    }

    public static void previousSecond(Time t){
        t.setSecond(t.getSecond()-1);
    }

    public static void addSecond(Time t){
        t.setTime(t.hour, t.minute, t.second+1);
    }

    public static void delSecond(Time t){
        t.setTime(t.hour, t.minute, t.second-1);
    }

    public static Time addTime(Time t1, Time t2){
        int h = t1.getHour() + t2.getHour();
        int m = t1.getMinute() + t2.getMinute();
        int s = t1.getSecond() + t2.getSecond();
        return new Time(h, m, s);
    }

    public static Time delTime(Time t1, Time t2){
        int h = t1.getHour() - t2.getHour();
        int m = t1.getMinute() - t2.getMinute();
        int s = t1.getSecond() - t2.getSecond();
        return new Time(h, m, s);
    }

    public Time addTime(Time t){
        int h = this.getHour() + t.getHour();
        int m = this.getMinute() + t.getMinute();
        int s = this.getSecond() + t.getSecond();
        Time test = new Time();
        test.setTime(h, m, s);
        return test;
    }

    public Time delTime(Time t){
        int h = this.getHour() - t.getHour();
        int m = this.getMinute() - t.getMinute();
        int s = this.getSecond() - t.getSecond();
        Time test = new Time();
        test.setTime(h, m, s);
        return test;
    }

    public static String returnString1(){
        return new String("Ahmed");
    }

    public static String returnString2(){
        return "Ahmed";
    }

    // Main Class
    public static void main(String[] args){
        // See the test cases.
    }
}