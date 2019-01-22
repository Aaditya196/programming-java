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
    class DistanceTravelled {
    int initial_velocity, acceleration,time,distance;
    
    public void acceptDetails()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial velocity:");
        initial_velocity=sc.nextInt();
        System.out.println("Enter acceleration:");
        acceleration=sc.nextInt();
        System.out.println("Enter time:");
        time=sc.nextInt();
        }
    public void displayDetails()
        {
        System.out.println("Enter initial velociy:"+initial_velocity);
        System.out.println("Enter acceleration:"+acceleration);
        System.out.println("Enter time"+time);
        }
    public void calculateDistance(){
        distance=(initial_velocity*time)+((acceleration*(time*time))/2);
        System.out.println(" Distance Calculated:"+distance);
    }
        }
    public class DistanceTravelledTest{
       public static void main(String[] args) {
          DistanceTravelled dt  =new DistanceTravelled();
              dt.acceptDetails();
              dt.displayDetails();
              dt.calculateDistance();
              
              
        // TODO code application logic here
    }
    
}
