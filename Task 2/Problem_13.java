public class Problem_13 {
    public static void main(String[] args){

        int number = 150, index = 2;

        while(number / index != 1){

            if (number % index == 0){
                System.out.print(index + ", ");
                number /= index;
            }
            else{
                index++;
            }
        }
        System.out.println(number + ".");
    }
}
