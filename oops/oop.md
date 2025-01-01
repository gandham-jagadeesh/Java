
# Java OOPS : kunal playlist
 
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


# Extra's
- State , identity , behaviour of a classes and objects
- Nested Interface,Abstract classes,Interface
- static classes
- inner classes