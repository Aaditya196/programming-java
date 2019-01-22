
package display;
import java.util.Scanner;


public class alphabetCalculation {
    public static void main(String[]args){
     char a  ,word;
     
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter any word : " );
     word=sc.next().charAt(0);
     
     if(word== 'a')
     {
         System.out.println("same letter  " ); 
     }
     else
        {
            System.out.println("different letter  " );
        }
    }
    
}
