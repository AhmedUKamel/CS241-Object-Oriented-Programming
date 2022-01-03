# 1> which of the following classes defines a legal abstract class ?
___
1. Not correct
   * Abstract methods do not specify a body.
2. Not correct
   * Syntax error on token `abstract`.
3. Not correct
   * The abstract method unfinished in type A can only be defined by an abstract class.
4. Not correct
   * This method requires a body instead of a semicolon.
5. Correct
6. Correct
___
# 2> True or False ?
### (a) True.
### (b) True.
### (c) False.
### (d) True.
### (e) True.
___
# 3> Which of the following is a correct interface ?
1. Not correct
   * Abstract methods do not specify a body.
2. Not correct
   * Abstract methods do not specify a body.
3. Not correct
   * Invalid method declaration; return type required.
4. Correct
5. Correct
6. Correct
___
# 4> Code
~~~java
public interface Comparable {
    public static max();
}
public class Shape implements Comparable {

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
# 6> Code
1. `ArrayList` of doubles
~~~java
ArrayList<Double>ListName = new ArrayList<Double>();
~~~
2. Append Object to list
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