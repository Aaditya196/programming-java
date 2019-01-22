
package display;
import java.util.Scanner;

public class prime
{
    public static void main(String[]args)
    {
        int n ,i ,j,count=1,num=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of prime numbers you want : " );
        n=sc.nextInt();
        
        if(n>=1)
        {
            System.out.println("First " +n+ " prime numbers are : -");
            System.out.println(2);
        }
         for(i=2;i<=n;)    
           {
             for(j=2;j<=Math.sqrt(num);j++)
             {
                
                   if(num%j==0)
                   {
                       count=0;
                       break;
                   }
             }
                  if(count!=0)
                   {
                        
                       System.out.println(num);
            i++;
           }
                 
        count=1;
        num++;
           }
           }
      
        }

 
    

