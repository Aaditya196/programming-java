
package display;
import java.util.Scanner;

public class arrayEven_Odd {
    public static void main(String[]args){
        int a[]=new int[10];
        int n , m=2,i;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements : ");
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]=sc.nextInt();
        a[4]=sc.nextInt();
        a[5]=sc.nextInt();
        a[6]=sc.nextInt();
        a[7]=sc.nextInt();
        a[8]=sc.nextInt();
        a[9]=sc.nextInt();
               
                for(i=0;i<=9;i++)
                {
               if(a[i]%m==0)
               {
                   System.out.println("This element is an even number ");
               }
               else
               {
                   System.out.println("The enter element is an odd number");
               }
    }
    
}
}
