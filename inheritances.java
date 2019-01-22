
package display;
import java .util.Scanner;


 class inheritances 
 {
    int page_num= 50;
    String authorname,name;
    float price;
    
    public inheritances()
    {
        page_num=50;
        authorname="chetan bhagat";
        name="revolutionary 2020";
        price=(float) 150.00;
    }
    public void displayInfo(){
        System.out.println(" The name of the book is " +name);
        System.out.println(" The price of the book is " +price);  
        System.out.println(" The author name is " +authorname);
        System.out.println(" The total no. of pages is " +page_num);
    }
}
class paperbooks extends inheritances
{
    int shippingcharges=10;
    public void printInfo(){
        displayInfo();
        System.out.println("The shipping charges are " + shippingcharges);
        
    }
    public static void main(String[]args){
        paperbooks pb=new paperbooks();
        pb.printInfo();
    }
}