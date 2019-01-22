
package display;
import java.util.Scanner;

public class quadratic {
    public static void main(String[]args){
        int a,c,b,d,fac1,fac2;
     Scanner sc=new Scanner (System.in);
        System.out.println("Enter value of a : " );
        a=sc.nextInt();
         System.out.println("Enter value of b : " );
        b=sc.nextInt();
         System.out.println("Enter value of c : " );
        c=sc.nextInt();
        
        d=(b*b)-4*a*c;
        if(d<=0)
        {
             System.out.println("please enter other than these values " );
        }
        
        fac1=(-b+(d^(1/2)))/(2*a);
         System.out.println(" value of factorial for positvie term : " +fac1 );
         
         fac2=(-b-(d^(1/2)))/(2*a);
          System.out.println("value of factorial for negative term : " +fac2 );
         
        
    }
    
}
