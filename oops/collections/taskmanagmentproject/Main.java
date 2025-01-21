package taskmanagmentproject;

import java.util.*;

public class Main{
    public static void main(String args[]){
        Student std0 = new Student(104, "janu", "cse");
        Student std1 = new Student(101, "jagadeesh", "cse");
        Student std2 = new Student(102, "siddhu", "cse");
        Student std3 = new Student(102, "superra", "ece");


        Set<Student> students = new LinkedHashSet<>();
        
        List<Student> stds    = new ArrayList<>();
        stds.add(std0);
        stds.add(std1);
        stds.add(std2);
        stds.add(std3);
        
       
        for(Student s:stds){
            System.out.println(s);
        }
        students.add(std0);
        students.add(std1);
        students.add(std2);
        students.add(std3);

        Collections.sort(stds);
        System.out.println(stds);
        //System.out.println(students);
        // for(Student std:students){
        //     System.out.println("std "+std.getId());
        //     System.out.println("std Name "+std.getName());
        //     System.out.println("std Branch "+std.getBranch());
        //     std.PrivateAcessMembers(std3); //example of access private members inside an instance class
        // }
    }
}