/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionsloops;
import java.util.Scanner;

/**
 *
 * @author intex
 */
     class FactorialNumber {
     int number=0,factorial_number=1;
     public void acceptDetails(){
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter any number:");
         number=sc.nextInt();
        
     }
     
     
     public void displayDetails(){
       
        for (int i=1;i<=number;i++)
        {
            factorial_number=i*factorial_number;
        }
        System.out.println("the factorial "+number+" is " +factorial_number);
     }
     }

     public class FactorialNumberTest{
     public static void main(String[]args){
     FactorialNumber fn=new FactorialNumber();
       fn.acceptDetails();
       fn.displayDetails();
      
}
}


