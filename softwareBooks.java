/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.polymorphism;
import java .util.Scanner;

 class softwareBooks extends Books 
 {
   int software_version;
   String software_name;
   
   public void getDetails(){
       super.getDetails();
       Scanner input=new Scanner (System.in);
       System.out.println("enter the software name : " );
       software_name=input.next();
       System.out.println("enter the software version : ");
       software_version=input.nextInt();
       showDetail();
  }
   public void showDetail(){   
       System.out.println("The details of software books are:-");
       System.out.println("author name:"+super.author_name);
       System.out.println("title:"+super.title);
       System.out.println("price:"+super.price);
       System.out.println("stock:"+super.stock);
       System.out.println("no. of pages:"+super.number_of_pages);
       System.out.println("software name:"+software_name);
       System.out.println("software version:"+software_version);
   } 
}
