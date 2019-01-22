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
 class Alphabets {
        char alpha;
    public void acceptDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any letter:");
        alpha=sc.next().charAt(0);
    }
    public void displayDetails(){
        
        switch(alpha)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u' :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }  
}
 

public class AlphabetTest{
     public static void main(String[]args){
         Alphabets ab;
         ab = new Alphabets();
           ab.acceptDetails();
           ab.displayDetails();
           
           
     }
}
