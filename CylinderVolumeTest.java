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
 class CylinderVolume {
     int radius,height,volume,PI;
     
     
     
     
     public void acceptDetails(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value for radius:");
         radius=sc.nextInt();
         System.out.println("Enter the value for height:");
         height =sc.nextInt();
         PI=(22/7);
        }
     public void displayDetails(){
         System.out.println("value of radius:"+radius);
         System.out.println("value of height:"+height);
     }
     public void calculateVolume(){
         volume=PI*radius*radius*height;
         System.out.println("the volume is:"+volume);
     }  
     }
     
     public class CylinderVolumeTest{
         public static void main(String[]args){
             CylinderVolume cv=new CylinderVolume();
             cv.acceptDetails();
             cv.displayDetails();
             cv.calculateVolume();
         }
     }
    

