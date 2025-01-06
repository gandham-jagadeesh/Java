package hierarchy;

public class  BackendDeveloper extends Developer{

    private String database;

    public BackendDeveloper(int id,double salary,String name,String language,String database){
        super(id,salary,name,language);
        this.database=database;
    }

    public void setdatabase(String database){
        this.database = database;
    }

    public String getStyling(String database){
       return this.database;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Database: "+this.database);
    }
    
}