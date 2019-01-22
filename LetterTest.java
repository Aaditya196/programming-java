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
 class Letter {
     String guess;
     char alphabets;
 String str="HelloJava";
 int flag=0,i;
 
 
 public void displayDetails(){
  do{
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the letter:");
     alphabets =sc.next().charAt(i);
     for( i=0;i<str.length();i++){
     if (alphabets==str.charAt(i)){
         flag=1;
     }
     if (flag==1)
     {
         System.out.println("letter is present in the word!!!");
     }
     else{
         System.out.println("letter is not present...");
     }
     
     System.out.println("do want to guess again(y/n):");
     guess=sc.nextLine();
     flag=0;
     }
     
     }while(guess.equals("y")||guess.equals("Y"));
     
 }
 }
     
 
 public class LetterTest{
     public static void main(String[]args){
         Letter lt=new Letter();
         lt.displayDetails();
     }
 }
    

