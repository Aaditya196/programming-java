
package display;
import java.util.*;


 public class arithmetic 
 
 {
     public static void main(String[]args){
         int a,b,res;
         try {
    
     Scanner sc=new  Scanner(System.in);
     System.out.println("Enter the value : ");
     a=sc.nextInt();
     System.out.println("Enter the value : ");
     b=sc.nextInt();
     res=a/b;
     System.out.println("the result of operation is : " +res);
     
     }
         catch(Exception ex)
         {
             System.out.println("Please enter the value other than zero & value must be greater than 0");
         }
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value : ");
          a = sc.nextInt();
         System.out.println("Enter the value : ");
          b = sc.nextInt();
          res = a/b;
         System.out.println("The result of the operation is :" +res);
}
 }
