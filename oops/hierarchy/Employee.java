package hierarchy;

public class Employee{
    public int id;
    public double salary;
    public String name;

    Employee(int id,double salary,String name){

        this.salary   = salary;
        this.name = name;
        this.id = id;
    }

  public int getId(){
    return this.id;
  }


  public double salary(){
    return this.salary;
  }

  public String name(){
    return this.name;
  }

  public void setId(int id){
     this.id = id;
  }

  public void setSalary(double salary){
    this.salary = salary;
  }

  public void setName(String name){
    this.name = name;
  }

  public void printDetails(){
    System.out.println("Name: "+this.name);
    System.out.println("Salary: "+this.salary);
    System.out.println("id: "+this.id);
  }

}