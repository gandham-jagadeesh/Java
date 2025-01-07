package emphierarchy.model;

public class Manager extends Employee{
    // extends the Employee class

    // add a new field teamSize
     private int teamSize;

     Manager(int id,String name,double salary,int teamSize){
        super(id,name,salary);
        this.teamSize=teamSize;
     }

     public void setTeamSize(int teamSize){ this.teamSize = teamSize;}
     public int getTeamSize(){return this.teamSize;}

     
     public void printDetails(){
        System.out.println("Id : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
        System.out.println("TeamSize :"+getTeamSize());
     }
}
