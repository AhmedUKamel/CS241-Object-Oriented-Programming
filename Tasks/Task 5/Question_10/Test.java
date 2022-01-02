public class Test {
    public static void main(String[] args){
        Object fruit = new Fruit();
        Object apple = (Apple)fruit;
    }
}
/*
Error: class Fruit cannot be cast to class Apple.
*/