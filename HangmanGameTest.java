
package display;
import java.util.Scanner;

 class HangmanGame 
 {
    int value;
   
    public void displayDetails(){
         System.out.println("---------Menu---------");
        System.out.println("1.Play ");
        System.out.println("2.Instructions");
        System.out.println("3.Exit");
        Scanner sc =new Scanner(System.in);
        System.out.println("\nchoose the option : ");
        value=sc.nextInt();
    }
 }
    public class HangmanGameTest{
    public static void main(String[] args)
    {
       HangmanGame hg=new HangmanGame();
      
       hg.displayDetails();
    }
    
}
