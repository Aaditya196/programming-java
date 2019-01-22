
package display;
import java.util.Scanner;

public class LCM {
    public static void main(String[]args){
        int n1,n2,lcm;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number : " );
        n1=sc.nextInt();
        
        System.out.println("Enter the 2nd number : " );
        n2=sc.nextInt();
        
        int num1 = n1/2;
        System.out.println(" " +num1);
        int num2=num1/2;
        System.out.println(" " +num2 );
        int num3=num2/num2;
        System.out.println(" " +num3 );
        
         int snum1=n2/2;
         System.out.println(" "+snum1 );
         int snum2=snum1/2;
         System.out.println(" " +snum2);
         int snum3=snum2/snum2;
         System.out.println(" "+snum3 );
         
         if(n1==n2)
         {
              System.out.println(" LCM of number is : " +n1 );
         }
         if(num1==snum1)
         {
            System.out.println("LCM of the number is : " +snum1 );  
         }
    
    
}
}