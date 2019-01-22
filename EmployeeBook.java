
package display;
import java .util.Scanner;

 class Employee 
{
    String EmployeeName,department,designation,maritalStatus,address;
    int employeeID,date_of_joining,date_of_birth,date_of_marriage,mobileNumber;
    
    public void employeeInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----EMPLOYEE DETAILS-----");
        System.out.println("Employee Name : " );
        EmployeeName=sc.next();
        System.out.println("Enter Employee ID :");
        employeeID=sc.nextInt();
        System.out.println("Enter Department :");
        department=sc.next();
        System.out.println("Enter Designation :");
        designation=sc.next();
        System.out.println("Enter Date Of Joining :");
        date_of_joining=sc.nextInt();
        System.out.println("Enter Date Of Birth :");
        date_of_birth=sc.nextInt();
        System.out.println("Enter Marital Status :");
        maritalStatus=sc.next();
        System.out.println("Enter Date Of Marriage :");
        date_of_marriage=sc.nextInt();
    }
    public void employeePersonalInfo()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("-----EMPLOYEE's PERSONAL DETAILS-----");
         System.out.println("Employee Name : " );
         EmployeeName=sc.next();
         System.out.println("Employee's Mobile Number : " );
         mobileNumber=sc.nextInt();
         System.out.println("Employee's Residence : " );
         address=sc.next();
         System.out.println("Enter Marital Status :");
         maritalStatus=sc.next();
         System.out.println("Enter Date Of Birth :");
         date_of_birth=sc.nextInt();
    }
  }
public class EmployeeBook{
public static void main(String[]args){
Employee em=new Employee();
em.employeeInfo();
em.employeePersonalInfo();
}
}
