    package hierarchy;

public class Manager extends Employee{

    private int teamSize;
    public Manager(int id,double salary,String name,int teamSize){
        super(id,salary,name);
        this.teamSize=teamSize;
    }

    public int getteamSize(){
        return this.teamSize;
    }

    public void setTeamsize(int teamSize){
        this.teamSize = teamSize;
    }

    public void  printDetails(){
        super.printDetails();
        System.out.println("Teamsize: "+teamSize);
    }
}
