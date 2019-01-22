
package display;
import java.util.Scanner;

public class vowels {
    public static void main(String[]args){
       char a,e,i,o,u,letter;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter any letter : " );
      letter = sc.next().charAt(0);
      
      if(letter =='u'|| letter=='a'||letter =='e'||letter =='i'||letter =='o')
      {
          System.out.println("The entered letter is an vowel ");
      }
      else
        {
            System.out.println("The entered letter is an consonant ");
        }
    }
    
}
