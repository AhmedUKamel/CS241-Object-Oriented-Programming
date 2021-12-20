class problem_1{
    public static void main(String[] args){

        // Distance in kilometer
        double distance = 24 * 1.6;
        
        // Time in hours
        double time = 1 + 40/60.0 + 35/3600.0;
        
        // Speed in km/h
        double speed = distance / time;

        // Print Speed
        System.out.println("Speed = " + speed + " km/h");
    }
}