# Visibility in Java
___
![](https://i.stack.imgur.com/uUmXj.png)
___
## Visibility table
|Visibility|Public|Protected|Default|Private|
|----------|------|---------|--------------------|-------|
|From the same class|**Yes**|**Yes**|**Yes**|**Yes**|
|From any class in the same package|**Yes**|**Yes**|**Yes**|**No**|
|From any sub class in the same package|**Yes**|**Yes**|**Yes**|**No**|
|From any sub class outside the same package|**Yes**|**No**|**No**|**No**|
|From any non-sub class outside the same package|**Yes**|**No**|**No**|**No**|
___
## Folder Structure
* `src`: the folder contains the packages
  * [`firstPackage`](https://github.com/AhmedKamel188/Java/tree/main/Exercises/Exercise_6/src/firstPackage)
    * [`Person`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/firstPackage/Person.java)
    * [`Student`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/firstPackage/Student.java)
    * [`TestFirst1`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/firstPackage/TestFirst1.java)
    * [`TestFirst2`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/firstPackage/TestFirst2.java)
    * [`TestFirst3`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/firstPackage/TestFirst3.java)
  * [`secondPackage`](https://github.com/AhmedKamel188/Java/tree/main/Exercises/Exercise_6/src/secondPackage)
    * [`Vehicle`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/secondPackage/Vehicle.java)
    * [`Car`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/secondPackage/Car.java)
    * [`TestSecond1`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/secondPackage/TestSecond1.java)
    * [`TestSecond2`](https://github.com/AhmedKamel188/Java/blob/main/Exercises/Exercise_6/src/secondPackage/TestSecond2.java)
