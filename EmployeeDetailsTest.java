
package alchem;
import java.util.*;

 class EmployeeDetails {
 int employeeID, date_of_joining ,date_of_birth ,date_of_marriage ;
 String employee_name , department , designation , marital_status ;
 
 public void addDetails()
 {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the WorkerID:");
     employeeID=sc.nextInt();
     System.out.println("Enter the date_of_joining:");
     date_of_joining=sc.nextInt();
     System.out.println("Enter the date_of_birth:");
     date_of_birth=sc.nextInt();
     System.out.println("Enter the date_of_marriage:");
     date_of_marriage=sc.nextInt();
     System.out.println("Enter the employee_name:");
     employee_name=sc.next();
     System.out.println("Enter the department:");
     department=sc.next();
     System.out.println("Enter the designation:");
     designation=sc.next();
     System.out.println("Enter the marital_status:");
     marital_status=sc.next();
  }
 
 public void displayDetails()
 {
      System.out.println("Enter the employeeID:"+employeeID);
      System.out.println("Enter the date_of_joining:"+date_of_joining);
      System.out.println("Enter the date_of_birth:"+date_of_birth);
      System.out.println("Enter the date_of_marriage:"+date_of_marriage);
      System.out.println("Enter the employee_name:"+employee_name);
      System.out.println("Enter the department:"+department);
      System.out.println("Enter the designation:"+designation);
      System.out.println("Enter the marital_status:"+marital_status);
  }
  }
      public class EmployeeDetailsTest {
      public static void main(String[]args){
      EmployeeDetails ed=new EmployeeDetails();
      ed.addDetails();
      ed.displayDetails();
}
}
