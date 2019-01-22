
package display;
import java.util.Scanner;

public class leapYear {
    public static void main(String[]args){
        int year,leap;
       Scanner sc =new Scanner(System.in); 
       System.out.print("Enter the year to check -  ");
       year= sc.nextInt();
       leap = year%7;
       if(leap == 1){
           System.out.println("year is not a leap year ");
       }
       else 
       {
           System.out.println(" year is a leap year");
       }
       
    }
}

