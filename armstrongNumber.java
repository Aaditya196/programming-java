
package display;
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[]args){
        
        int n,a,b,c,num=0;
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any three digit number : ");
        n=sc.nextInt();
        
        num=n;
        
       c=num%10;
       num=n/10;
       b=num%10;
       num=num/10;
       a=num;
       
       if(n==(a*a*a)+(b*b*b)+(c*c*c))
       {
           System.out.println("The enter number is an armstrong number ");
       }
       
       else
       {
           System.out.println("Entered number is not an armstrong number ");
       }
       
      
        
    }
    
}
