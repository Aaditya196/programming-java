/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;
import java.util.Scanner;
/**
 *
 * @author intex
 */
 class Add {
   int a;
   public void displayDetails(){
       Scanner sc=new Scanner(System.in);
       a=(4*(4+8))/4;
       System.out.println("Value of a="+a);
   }
}
public class AddTest{
    public static void main(String[]args){
        Add ad=new Add();
        ad.displayDetails();
    }
}