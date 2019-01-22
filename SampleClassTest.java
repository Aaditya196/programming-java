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
    class SampleClass {
    int counter=1;
    public void counter(){
       Scanner sc; 
        sc = new Scanner(System.in);
    }
    public void displayDetails(){
        System.out.println("counter=1");
    }
    }
    public class SampleClassTest{
    public static void main(String[]args){
        SampleClass sc=new SampleClass();
        sc.displayDetails();
    }    
    }
