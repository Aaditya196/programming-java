            
package exceptHandling;
import java.util.Scanner;

public class one extends RuntimeException{
        String employee_id,employee_name,department,designation,marital_status,date_joining,date_birth,date_marriage;
int choice;
one(){
    System.out.println("Please provide a valid input(1-3)");
    System.out.println("employee ID should not start with 'e'");
}
    public void data(){
     Scanner sc = new Scanner(System.in);
     System.out.println("----- EMPLOYEE'S DETAILS -----");
        System.out.println("1. ENTER DATA ");
        System.out.println("2. VIEW DATA ");
        System.out.println("3. EXIT ");
        System.out.println("ENTER CHOICE : " );
        choice =0;
        try{
         choice = sc. nextInt();
        }
        catch(RuntimeException e ){
            System.out.println("Please provide a valid numeric input !!! ");
            data();
        }
        switch(choice){
            case 1 : EnterData();
                break;
            case 2 : ViewData();
                break;
            case 3 : exit();
                break;
            default : try {
                throw new one();
            }catch(Exception e ){
                data();
            }
        }
    }
    public void EnterData( ){
          Scanner sc1 =new Scanner(System.in);
         String ch = "e";
         try{
     System.out.println("Enter the Employee ID : ");
     employee_id=sc1.next();
     
         if (employee_id.charAt(0)==ch.charAt(0)){
             System.out.println("Enter the id starting from letter other than 'e' ");
             
             data();
                 }       
         
         }
         catch(Exception e){
                 data();
                 }
         
         
     System.out.println("Enter the date_of_joining : ");
     date_joining=sc1.next();
     System.out.println("Enter the date_of_birth  : ");
     date_birth=sc1.next();
     System.out.println("Enter the date_of_marriage : ");

     employee_name=sc1.next();
     System.out.println("Enter the department : ");
     department=sc1.next();
     System.out.println("Enter the  designation : ");
     designation=sc1.next();
     System.out.println("Enter the marital_status:");
     marital_status=sc1.next();
        String st ="married";
   if(marital_status.equals(st) )
       System.out.println("Enter the date_of_marriage : ");
     date_marriage=sc1.next();
   }
   
    public void ViewData(){
        String st1 ="aadi1";
        Scanner sc2 =new Scanner(System.in);
        System.out.println("Enter the Employee ID : " );
        String id = sc2.nextLine();
       
        if(id.equals(st1)){
              System.out.println(" \n employee_name : " +employee_name);
              System.out.println("\n  marital_status : " +marital_status);
              System.out.println(" \n date_of_birth : " +date_birth);
              System.out.println(" \n department : " +department);
        }
        else{
            System.out.println("Please enter right choice");
        }
    }
    public void exit(){
        System.exit(0);
    }
    public static void main(String[]args){
        one em =new one();
        em.data();
    }
            
}
   
     
