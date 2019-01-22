/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;
import java .util.Scanner;
/**
 *
 * @author intex
 */
 class FahrenheitTemperature {
    int celsius,c;
    float fahrenheit,f;
    
    public void acceptDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of temperature in celcius:");
        celsius=sc.nextInt();
        celsius=c;
        fahrenheit=f;
        }
    public void displayDetails(){
        System.out.println("celsius:"+celsius);
        }
        
    public void calculateFahrenheit(){
        f=(c*(9/5))+32;
        System.out.println("Temperature in Fahrenheit:"+fahrenheit);
    }
        
    }
    
     public class FahrenheitTemperatureTest{
         public static void main(String[]args){
             FahrenheitTemperature ft=new FahrenheitTemperature();
             ft.acceptDetails();
             ft.displayDetails();
             ft.calculateFahrenheit();
             
             
         }
     }
