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
|From any sub class outside the same package|**Yes**|**Yes**|**NO**|**No**|
|From any non-sub class outside the same package|**Yes**|**NO**|**NO**|**No**|
___
## Folder Structure
* `src`: the folder contains the packages
  * `firstPackage`
    * `Person`
    * `Student`
    * `TestFirst1`
    * `TestFirst2`
  * `secondPackage`
    * `Vehicle`
    * `Car`
    * `TestSecond1`
    * `TestSecond2`
