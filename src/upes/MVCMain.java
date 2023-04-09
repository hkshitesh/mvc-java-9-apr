package upes;

import java.util.Scanner;

public class MVCMain {
	
    public static void main(String[] args) 
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Details");
        String name= sc.next();
        String id = sc.next();
        String dept=sc.next();
       Employee model = retriveEmployeeFromDatabase(name,id,dept);  
       EmployeeView view = new EmployeeView();  
       EmployeeContoller controller = new EmployeeContoller(model, view);     
       controller.updateView();  
    }  
      private static Employee retriveEmployeeFromDatabase(String name, String id, String dept){  
       Employee Emp = new Employee();  
       Emp.setName(name);  
       Emp.setId(id);  
       Emp.setDepartment(dept);  
       return Emp;  
    }  
 }  
