package emphierarchy.model;

public abstract class Employee {
    // add private fields for id, name and salary
    private int id;
    private String name;
    private double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public double getSalary() { return this.salary; }

    public void setId(int id){ this.id=id;}
    public void setName(String name){ this.name = name; }
    public void setSalary(double salary){ this.salary = salary; }

    // add an abstract method displayDetails()
    public abstract  void printDetails();

}
