package emphierarchy.model;

    // extends the Employee class
public class Developer extends Employee{

    private String language;
    // add a new field language

     public Developer(int id,String name,double salary,String language){
        super(id,name,salary);
        this.language=language;
    }

    public String getLanguage(){   return this.language; }
    public void   setLanguage(String language){ this.language = language; }

    public void printDetails(){

        System.out.println("Id : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
        System.out.println("Language :"+getLanguage());
    
    }
}
