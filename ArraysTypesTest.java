
package arrays;
import java.util.Scanner;

 class ArraysTypes {
     String employee_name,department,designation,marital_status,married,employee_ID,inputId;
     int date_of_joining,date_of_birth,date_of_marriage,option;
     
     public void acceptDetails(){
         Scanner sc=new Scanner(System.in);
         System.out.println("employee_name:");
         employee_name=sc.next();
         System.out.println("department:");
         department=sc.next();
         System.out.println("designation:");
         designation=sc.next();
         System.out.println("marital_status:");
         marital_status=sc.next();
         System.out.println("employee_ID:");
         employee_ID=sc.next();
         System.out.println("date of joining:");
         date_of_joining=sc.nextInt();
         System.out.println("date of birth:");
         date_of_birth=sc.nextInt();
         System.out.println("enter the option:"+option);
         option=sc.nextInt();
     }
        public void displayDetails(){
            System.out.println("employee name"+ employee_name);
            System.out.println("employee id"+ employee_ID);
            System.out.println("designation:"+ designation);
            System.out.println("department:"+ department);
            System.out.println("date of joining"+ date_of_joining);
            System.out.println("date of birth:"+ date_of_birth);
            System.out.println("marital status:"+ marital_status);
           
            switch(option){
                case 1: enterData();
                    break;
                case 2:viewData();
                    break;
                case 3:System.out.println("exit");
               System.exit(0);
                break;            
            }
        }
            
            public void enterData(){
                System.out.println("employee id:" + employee_ID);
                System.out.println("employee name:" + employee_name);
                System.out.println("department:" + department);
                System.out.println("designation:" + designation);
                System.out.println("date_of_joining:" + date_of_joining);
                System.out.println("date of birth:" + date_of_birth);
                System.out.println("marital status:" + marital_status);
         
                if(marital_status.equals(married))
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("date of marriage:"+date_of_marriage);
                    date_of_marriage=sc.nextInt();
                }
                } 
            public void viewData(){
                Scanner sc=new Scanner(System.in);
                System.out.println("employee id:"+inputId);
                inputId=sc.next();
                if(employee_ID==inputId){
                     System.out.println("employee name:"+employee_name);
                System.out.println("department:"+department);
                System.out.println("designation:"+designation);
                System.out.println("date_of_joining:"+date_of_joining);
                System.out.println("date of birth"+date_of_birth);
                System.out.println("marital status"+marital_status);
               }
                else{
                    System.out.println("error!!!");
                }
            }
 }

    public class ArraysTypesTest {
    public static void main(String[] args) {
        ArraysTypes at=new ArraysTypes();
        at.acceptDetails();
        at.displayDetails();
    }
   }
