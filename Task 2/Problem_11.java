public class Problem_11 {
    public static void main(String[] args){

        int num = 1;
        while (Math.pow(num, 3) <= 12000){
            num++;
        }

        System.out.println("The smallest cube number greater than 12.000 is " + num);
        System.out.println("As " + num + " ^ 3 = " + Math.pow(num, 3));
    }
}
