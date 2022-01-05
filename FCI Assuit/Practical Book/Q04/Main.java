public class Main {
    public static void main(String...args) {
        // And gate truth table
        System.out.println("And gate truth table:");
        truthTable("and");
        // Or gate truth table
        System.out.println("\nOr gate truth table:");
        truthTable("or");
        // Xor gate truth table
        System.out.println("\nXor gate truth table:");
        truthTable("xor");

    }

    public static void truthTable(String gate) {
        int a = 0, b = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                if(j==0)
                    if(i<2){
                        a = 1;
                        System.out.print("1\t");
                    } else {
                        a = 0;
                        System.out.print("0\t");
                    }
                else if(j==1){
                    b = (i+j) % 2;
                    System.out.print(b+"\t");
                } else{
                    switch(gate){
                        case "and": {System.out.print((a&b)+"\t"); break;}
                        case "or" : {System.out.print((a|b)+"\t"); break;}
                        case "xor" : {System.out.print((a^b)+"\t"); break;}
                    }
                }
            }
            System.out.println();
        }
    }
}
/*
Using logical operators print out the truth table for
the following expressions
a. A and B
b. A or B
c. A Xor B
*/