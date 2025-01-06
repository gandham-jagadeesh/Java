package hierarchy;

public class FrontendDev extends Developer{
    private String style;

    public FrontendDev(int id,double salary,String name,String language,String style){
        super(id,salary,name,language);
        this.style=style;
    }

    public void setStyling(String style){
        this.style = style;
    }

    public String getStyling(String styling){
       return this.style;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println(this.style);
    }

}