
package display;
import java.util.Scanner;
 class root {
  public double number(){
     double n,a = 0,b;
     Scanner sc =new Scanner(System.in);
    System.out.println("Enter number : ");
      n = sc.nextDouble();
      for(b=1;b<=(n-1);){
          a=(n/b);
        if(a==b){
            System.out.println("Square root is " +a);
            return a; 
        }  
        else{
           b++;
        }
      }
      return a;
          
  }
 }
  public class roots {
      public static void main(String[]args){
          root r;
          r= new root();
          r.number();
          
      }
  }

      
  

