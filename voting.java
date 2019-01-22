
package display;
import java.util.Scanner;

public class voting {
    public static void main(String[]args){
       
        int age=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Age : ");
        age=sc.nextInt();
     
        try {
            if (age<0){
                System.out.println("please enter your age correctly.");
            }
        if(age>150)
        {
            System.out.println("age exception is raised");
        }
           if( age==18 || age>18)
           {
               System.out.println("Congrats you are eligible to vote !!!");
           }
           else
           {
               System.out.println("Sorry you are not eligible to vote ...");
           }
        }
        catch(Exception e) 
                {
                   System.out.println("you can not vote");
                }
    }
            
    
}
