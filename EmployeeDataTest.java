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
 class EmployeeData {
     int choice;
     
     
     public void displayDetails(){
         
         System.out.println("----Menu----");
         System.out.println("1.Enter Data");
         System.out.println("2.Display Data");
         System.out.println("3.Exit");
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the choice:");
         choice=sc.nextInt();
         switch(choice)
         {
             case 1: enterData();
                 break;
             case 2:  displayData();
                 break;
             case 3: exitMenu();
                 break;
             default : System.out.println("error !!!");
                displayDetails();
                 break;
         }
     }
     
     
     
         public void enterData() {
       System.out.println("enterData() is invoked"); //To change body of generated methods, choose Tools | Templates.
    }

     public void displayData() {
        System.out.println("displayData() is invoked"); //To change body of generated methods, choose Tools | Templates.
    }

     public void exitMenu() {
        System.out.println("exitMenu() is invoked"); //To change body of generated methods, choose Tools | Templates.
    }
 }


        public class EmployeeDataTest{
        public static void main(String[] args) {
        EmployeeData ed=new EmployeeData();
        ed.displayDetails();
        
        }
        }



        
        
        
        
    

    
    

