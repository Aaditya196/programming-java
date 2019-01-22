/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.polymorphism;
import  java .util.Scanner;
/**
 *
 * @author intex
 */
public class Books {
    String author_name,title;
     int price,stock,number_of_pages;
    public void getDetails(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the author name : ");
        author_name=sc.next();
        System.out.println("Enter the title : ");
        title=sc.next();
        System.out.println("Enter the price : ");
        price=sc.nextInt();
        System.out.println("Enter no. of stock : ");
        stock=sc.nextInt();
        System.out.println("Enter the number of pages in the book : ");
        number_of_pages=sc.nextInt();
    }  
    }
    