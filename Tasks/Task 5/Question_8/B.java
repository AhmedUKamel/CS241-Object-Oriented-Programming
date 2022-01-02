public class B extends A {
    public B(){
        System.out.println("i from B is " + i); 
    }

    public void setI(int i){
        this.i = 3 * i;
    }
}