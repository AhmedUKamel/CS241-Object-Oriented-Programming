public class A {
    int i = 7;

    public A(){
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i){
        this.i = 2 * i;
    }
}