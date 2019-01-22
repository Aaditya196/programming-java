/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.polymorphism;
import java .util.Scanner;
/**
 *
 * @author intex
 */
 class hardwareBooks extends Books
 {
    String hardware_category,publisher;
    public void getasDetails(){
        super.getDetails();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the hardware category : ");
        hardware_category=input.next();
        System.out.println("Enter the publisher : ");
        publisher=input.next();
        showDetails();
    }
    public void showDetails(){
       System.out.println("The details of software books are:-");
       System.out.println("author name:"+super.author_name);
       System.out.println("title:"+super.title);
       System.out.println("price:"+super.price);
       System.out.println("stock:"+super.stock);
       System.out.println("no. of pages:"+super.number_of_pages);
       System.out.println("hardware category:"+hardware_category);
       System.out.println("publisher:"+publisher);
    }
}
