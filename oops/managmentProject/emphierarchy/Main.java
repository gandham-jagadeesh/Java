package emphierarchy;

import emphierarchy.model.Developer;
import emphierarchy.model.Employee;
import emphierarchy.model.Manager;
import emphierarchy.service.EmployeeOperation;
import emphierarchy.service.EmployeeOperationImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeOperation employeeOperation = new EmployeeOperationImpl();

        // Create some employee object and add them
        Employee emp1 = new Developer(101,"gj",25000,"js");
        Employee emp2 = new Developer(102,"aj",26000,"as");
        Employee emp3 = new Developer(103,"bj",27000,"bs");
        Employee emp4 = new Developer(104,"cj",28000,"cs");
        Employee emp5 = new Developer(105,"dj",29000,"ds");
        Employee emp6 = new Developer(105,"dj",29000,"ds");
        //Employee emp2 = new Manager(102,"mukesh",40000,4);
        employeeOperation.addEmployee(emp1);
        employeeOperation.addEmployee(emp2);
        employeeOperation.addEmployee(emp3);
        employeeOperation.addEmployee(emp4);
        employeeOperation.addEmployee(emp5);
        employeeOperation.addEmployee(emp6);

        // Find an employee with id
        int id = 101;
        Employee emp = employeeOperation.findEmployeeById(0);
        //System.out.println(emp.getId());
        
        // Display all the employees
        //employeeOperation.showAllEmployees();
        // Task to do later
        // Ask user to select an option
        // 1 - To add new Employee

    }
}