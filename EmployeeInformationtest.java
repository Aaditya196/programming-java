/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alchem;
import java.util.Scanner;
/**
 *
 * @author intex
 */
 class EmployeeInformation {
    int EnterData,updateData,DisplayData,Exit,Choose_the_option;
    public void displayMenu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("------Menu------");
        System.out.println("1.Enter Data");
        System.out.println("2.Update Data");
        System.out.println("3.Display Data");
        System.out.println("4.Exit");
        System.out.println("\nChoose the option:");
    }  
    }
public class EmployeeInformationtest{
    public static void main(String[]args){
    EmployeeInformation ei=new EmployeeInformation();
    ei.displayMenu();
} 
    
}
    

