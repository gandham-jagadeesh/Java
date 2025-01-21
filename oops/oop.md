
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


## lecture -2 ```04-01-2025```
 ### topics
    packages
    import
    how jvm run time search for packages
    static keyword
    static vs nonstatic context
    calling two non static methods : fun( greeting() ) ->  outer one will be taken care of object both class related to same obj
    static block -> only run once when class is loaded no matter how many objects we created
    [x] innerclasses : nested classes can be static 
    Internal workings of System.out.println()
    singleton class 

## lecture - 3 `08-01-2025`
 ### topics
    Inheritance
        - super keyword
        - parent reference child object  creation : Parent ref = new child(); 
        - private keyword   -> subclasses can call construtor of parent class but can't access baseclass members use setter and getter 
        - protected keyword -> subclasses can access members of base class if baseclasses members are protected
        - Parent class super() -> calls object() constructor of object class which is the base class of the any class in java
        - Datatype ref = new child -> datatype is what matters (like access only related to Datatype not child class memebers)
        - Types of inheritance ->  
                                    1.Single inheritance
                                    2.multilevel
                                    3.multiple [x]
                                    4.hierarchial
                                    5.hydrid [x]
    Polymorphism
        - compile time / static Polymorphism : method Overloading
        - run time Polymorphism / dynamic Polymorphism : method Overriding : body can be diff but rest should be same        
        - parent ref = new child : if parent,child contains same method ref will call child method not parent one's
        - dynamic method dispatch / late binding
        - final keyword
        - final class -> all are final
        - static methods can't over ride due to the its doesn't depend on the object but it can inherit

    Encapsulation
        - wrapping up the members and methods in a class
        - build stuff with out exposing (encaps) and show only useful stuff (Abstracts)
    
    Abstraction
        - show essential info hide valuable information
        - ex: car
        - ArrayList example : using them without knowing the internals
    
    Data hiding:
        - hiding data 
        - ex: Arraylist interals array : can't access directly
        - wrapping up the object like methods and stuff is Encapsulation

## lecture 4 `15-01-2024`
### Topics
    - Access Modifiers : private,public,default,protected
    


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
- upCasting
- early binding and lazy binding : final keyword methods
- compareTo method vs str1.equals() method


## object typecasting
     to check whether an object is an instace of a particular class
     java16 object instanceof class  ex: student instanceof Student -> checks to see whether student is an instance of Student
     Student stu = (Student) obj -> typecasting and type safety
     single line -> java 16     if (o instanceof Trainee trainee) -> checks and cast in one go

## ComparatorInterface
    class extends comparatorInterface so we can implement compareTo() to sort based on our own predefined objects
    when sort compareTo() will be used to sort the objects
    ex:collections.sort(students)

## Equals and hashcode Methods
    check to see identify between objects : ex : sid1,sid2 with same ids are consider equal objects
    used in hashset,linkedlistset,hashmap
