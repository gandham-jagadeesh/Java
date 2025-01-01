
# Java OOPS
 
## Lecture - 1 ```31-12-2024```: 
 ### Topics
-  class
- Objects
- Constructor
- Constuctor Overloading
- this
- [this() keyword](#this)
- new keyword
-  Wrapper class
- final keyword -> primitive Data types,objects
- Garbage Collection 
    - [  ] Finalize Method 
    - [  ] @Override 
    - [  ] throws Throwable 
- [  ] Packages 






### this()
- without this()
 ```java
class Student {
    int id;
    String name;

    public Student() {
        this.id = 0;
        this.name = "Unknown";
    }

    public Student(int id) {
        this.id = id;
        this.name = "Unknown"; // Repeated initialization
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
        }
```
-  with this() keyword
```java
class Student {
    int id;
    String name;

    public Student() {
        this(0, "Unknown");  Call parameterized constructor
    }

    public Student(int id) {
        this(id, "Unknown");  Call parameterized constructor
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```
## HashMap Practice:: 
    1. Write a Java program to associate the specified value with the specified key in a HashMap.
    2. Write a Java program to count the number of key-value (size) mappings in a map.
    3. Write a Java program to copy all mappings from the specified map to another map.
    4. Write a Java program to remove all mappings from a map.
    5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    6. Write a Java program to get a shallow copy of a HashMap instance.
    7. Write a Java program to test if a map contains a mapping for the specified key.
    8. Write a Java program to test if a map contains a mapping for the specified value.
    9. Write a Java program to create a set view of the mappings contained in a map.
    10. Write a Java program to get the value of a specified key in a map.
    11. Write a Java program to get a set view of the keys contained in this map.
    12. Write a Java program to get a collection view of the values contained in this map.




# Extra's
- State , identity , behaviour of a classes and objects
- Nested Interface,Abstract classes,Interface
- static classes
- inner classes