package game;
import java.util.Scanner;
public class Hangman {
    public void ShowMenu(){
     int option;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------ MENU ------");
        System.out.println("1. PLAY ");
        System.out.println("2. INSTRUCTIONS "); 
        System.out.println("3. EXIT ");
        System.out.println(" ENTER OPTION : ");
        option= sc.nextInt();
    } 

    public static void main(String args[]){
        Hangman hg = new Hangman();
        hg.ShowMenu();
    }
    
}
