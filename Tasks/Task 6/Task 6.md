# 1> which of the following classes defines a legal abstract class ?
___
1. Incorrect
   * Abstract methods do not specify a body.
2. Incorrect
   * Syntax error on token `abstract`.
3. Incorrect
   * The abstract method unfinished in type A can only be defined by an abstract class.
4. Incorrect
   * This method requires a body instead of a semicolon.
5. Correct
6. Correct
___
# 2> True or False ?
1. True
2. True
3. False
4. True
5. True
___
# 3> Which of the following is a correct interface ?
1. Incorrect
   * Abstract methods do not specify a body.
2. Incorrect
   * Abstract methods do not specify a body.
3. Incorrect
   * Invalid method declaration; return type required.
4. Correct
5. Correct
6. Correct
___
# 4> Code
~~~java
public interface Comparable {
}

public class Shape implements Comparable {
    public double area;
    public Shape(double a){
        this.area = a;
    }
    public Shape max(Shape s){
        return (this.area > s.area)? this : s;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Circle c2 = new Circle(6);
        System.out.println(c1.max(c2).radius);
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(5, 4);
        System.out.println(r1.max(r2).length);
    }
}

public class Circle extends Shape {
    public double radius;
    public Circle(double r) {
        super(r * r * 3.14);
        this.radius = r;
    }
    public Circle max(Circle s){
        return (this.radius > s.radius)? this : s;
    }
}

public class Rectangle extends Shape {
    public double length;
    public double width;
    public Rectangle(double l, double w){
        super(2 * (l + w));
        this.length = l;
        this.width = w;
    }
    public Rectangle max(Rectangle r){
        return (this.area > r.area)? this : r;
    }
}
~~~
___
# 5> Code
~~~java
public static void average(ArrayList list){
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum+= Integer.parseInt(list.get(i).toString());
        }
        double avg = sum/list.size();
        System.out.println("Average : "+avg);
    }
~~~
___
# 6> Code
1. `ArrayList` of doubles
~~~java
ArrayList<Double>ListName = new ArrayList<Double>();
ArrayList<Double>ListName = new ArrayList<>();
~~~
1. Append Object to list
~~~java
ListName.add(Object);
~~~
3. Insert Object at the beginning
~~~java
ListName.add(0, Object);
~~~
4. Find Object in List
~~~java
ListName.get(INDEX).equals(Object);
~~~
5. Remove given Object from List
~~~java
ListName.remove(Object);
ListName.remove(INDEX);
~~~
6. Remove last Object from List
~~~java
ListName.remove(ListName.size()-1);
~~~
7. Check whether Object in List or not
~~~java
ListName.get(INDEX).equals(Object);
~~~
8. Retrieve an Object from List
~~~java
ListName.get(INDEX);
~~~
___
# 7> Identify the error in the following code
~~~java
ArrayList<String> list = new ArrayList<>();
list.add("Denver");
list.add("Austin");
list.add(new java.util.Date());
String city = list.get(0);
list.set(3, "Dallas");
System.out.println(list.get(3));
~~~
* Line 4: Can't add `Date type` to `String type`
* Line 6: index 3 is out of range
* Line 7: index 3 is out of range
___
# 8> What is the output of the following code
~~~java
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.remove(1);
System.out.println(list);
~~~
* Output:
~~~
[1, 3]
~~~
<br><p style="color:red;">Will delete the element with index 1, not element with value 1</p>
___
# 9> Can each of the following statement be Compiled ?
* <p style="color:red;">Only <b>e</b> can't be Compiled because Double class has no empty Constructor</p>
~~~java
Double d = new Double();
~~~
* <p style="color:green;">All expressions can be compiled successfully</p>
___
# 10> Show the output of the following code
~~~java
public static void main(String[] args) {
   Integer x = new Integer(3);
   System.out.println(x.intValue());
   System.out.println(x.compareTo(new Integer(4)));
}
~~~ 
* Output: 
~~~
3
-1
~~~
* Reference for [compareTo](https://www.w3schools.com/java/ref_string_compareto.asp) method.
___
# 11> What are thr output of the following expressions
### Suppose s1, s2, s3 and s4 are four Strings, Given as following:
~~~java
String s1 = "Welcome to java";
String s2 = s1;
String s3 = new String("Welcome to java");
String s4 = "Welcome to java";
~~~
* Point A
~~~java
s1 == s2
true
~~~
* Point B
~~~java
s1 == s3
false
~~~
* Point C
~~~java
s1 == s4
true
~~~
* Point D
~~~java
s1.equals(s3)
true
~~~
* Point E
~~~java
s1.equals(s4)
true
~~~
* Point F
~~~java
"Welcome to java".replace("java", "HTML")
Welcome to HTML
~~~
* Point G
~~~java
s1.replace('o', 't')
Welctme tt java
~~~
* Point H
~~~java
s1.replaceAll("o", "t")
Welctme tt java
~~~
* Point I
~~~java
s1.replaceFirst("o", "t")
Welctme to java
~~~
* Point J
~~~java
s1.toCharArray()
Welcome to java
~~~
___
# 12> Code
~~~java
public static void main(String[] args) {
   String s1 = "Welcome", s2 = "welcome";
   String s3 = s1.replace('e', 'E');
   s1 = "Welcome to Java and HTML".split(" ")[0];
   s2 = "Welcome to Java and HTML".split(" ")[1];
}
~~~