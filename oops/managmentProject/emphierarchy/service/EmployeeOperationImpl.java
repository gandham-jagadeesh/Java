package emphierarchy.service;

import emphierarchy.model.Employee;
import emphierarchy.inputexception.RecordNotFoundException;

public class EmployeeOperationImpl implements EmployeeOperation{

    private Employee[] employees = new Employee[5];
    int count = 0;
    
    public void addEmployee(Employee employee) {
        if( this.count < 5 && employee != null ){
        employees[count]=employee;
        System.out.println("Employee Added :"+employee.getName());
        count+=1;
        }
        else{
         System.out.println("Arrays is Filled");
        }
    }

    public void showAllEmployees() {

        for(Employee emp:employees){
            if(emp == null){
                break;
            }
            else{
                emp.printDetails();
            }
        }
    }

    public Employee findEmployeeById(int id) {
        for(Employee emp:employees){
            if(emp != null){
                if(emp.getId() == id)
                    return emp;
            }
               
        }
        throw new RecordNotFoundException("Record not Found Exception");
    }
}
