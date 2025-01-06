public class Company{
    private String name;
    private String location;
    private String type;

    Company(String name,String location,String type){
        this.name = name;
        this.location=location;
        this.type = type;
    }

    public String getName(){
        return this.getName; 
    }

    public String getLocation(){
        return this.getLocation;
    }

    public String getType(){
        return this.getType;
    }

    public void printDetails(){
     System.out.println("Name : " + this.name);
     System.out.println("Location : "+this.location);
     System.out.println("Type  : "+this.getLocation);
    }
}

