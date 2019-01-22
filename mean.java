
package display;
import java. util .Scanner;

public class mean {
    public static void main(String[]args){
        int a ,b, c;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : " );
        a=sc.nextInt();
        System.out.println("Enter the number : " );
        b=sc.nextInt();
        System.out.println("Enter the number : " );
        c=sc.nextInt();
        
        int mean = (a+b+c)/2;
        
        System.out.println("Mean of the numbers is : " +mean);
    }
    
}
