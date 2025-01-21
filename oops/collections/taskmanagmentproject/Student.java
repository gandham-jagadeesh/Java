package taskmanagmentproject;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String branch;

    Student(int id,String name,String branch){
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public int getId(){ return this.id;}
    public String getName(){return this.name;}
    public String getBranch(){return this.branch;}

    public void setId(int id){ this.id = id;}
    public void setName(String name){ this.name = name;}
    public void setBranch(String branch){ this.branch = branch;}

    public boolean equals(Object std){
        //check whether check whether is this instance of itself
         if(this == std) return true;
         if(!(std instanceof Student student)) return false; //newer version
         return this.id == student.id;
        // older version
        // check instance of student object or not
        // if(std instanceof Student){
        //     Student st = (Student) std;
        //     //use the methods for any purposes
              // st.id some thing like use the same -> because .equals is an instance method inside an instance method we can use the another objects field members like trainee.id 
        // }
        
    }

    public void PrivateAcessMembers(Student std){
        System.out.println("Inside an instance method");
        System.out.println(std.id);
        System.out.println(std.name);
    }

        public int compareTo(Student std){
            int diff = this.id - std.id;
            return diff;
        }
        
    public int hashCode(){
        int result = this.id;
        result = 31 * result + this.name.hashCode();
        return result;

    }


}