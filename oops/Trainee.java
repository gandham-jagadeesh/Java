public class Trainee{
    private int id;
    private String name;
    Private Company Company;
    private String language;

    public Trainee(int id,String name,String language){
        this.id=id;
        this.name=name;
        this.language=language;
    }

    
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public void setCompany(Company Company){
        this.Company = Company;
    }
    
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String setLanguage(){
        return this.language;
    }

    public void getCompany(){
        return this.Company = Company;
    }

}