

public class oops{

class Student{
    String rollno;
    String name;
    int age;
    String branch;

    Student (String rollno,String name,int age,String branch){
        this.rollno = rollno;
        this.name = name;
        this.age=age;
        this.branch=branch;
    }

    void getStudentrollno(){
        System.out.println("Roll No : " + this.rollno);
    }
}

    public static void main(String args[]){
         Student std1 = new oops.Student("5f1","jaggu",25,"cse");
         std1.getStudentrollno();
        System.out.println("This is Awesome");
    }
}