class problem_1{
    public static void main(String[] args){

        double distance = 24 * 1.6f;             // distance in kilometer
        double time = 1 + 40/60.0 + 35/3600.0;   // time in hours
        double speed = distance / time;          // speed in km/h

        System.out.println("Speed = " + speed + " km/h");
    }
}