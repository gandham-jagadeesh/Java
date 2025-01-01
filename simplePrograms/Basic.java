import java.util.Scanner;

public class Basic{   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int    age  = sc.nextInt();
        sc.nextLine(); //consumer next line bufer -> nextLine will take \n too but not nextInt
        String location = sc.nextLine();
        Person p1 = new Person();
        p1.readPerson(name,age,location);
        p1.printPerson();
    }
}


class Person{
    String name;
    int age;
    String location;

    void readPerson(String name,int age,String location){
        this.name=name;
        this.age=age;
        this.location=location;
    }

    void printPerson(){

        System.out.println(this.name + " "  + this.age + " "  +  this.location);
    }
}
//learn to build java based application but these have nothing to with platforms right
