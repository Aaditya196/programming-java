
package display;
import java.util.*;

public class reversing 
{
public static void main(String[]args){
     int n ,num;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a 5 digit number : " );
     num=sc.nextInt();
     n=num;
    int num1 = n%10; 
    num1=num1*10000;
    int rem = num1;
    n=n/10;
    int num2 = n%10;
    num2=num2*1000;
    rem=rem+num2;
    n=n/10;
    int num3 = n%10 ;
    num3 = num3 *100;
    rem=rem+num3;
    n=n/10;
    int num4 = n%10;
    num4=num4*10;
    rem=rem+num4;
    n=n/10;
    int num5 =n;
    num5 =num5*1;
    rem=rem+num5;
    
    System.out.println("The reverse of the number is : " +rem);
    
    }
}
