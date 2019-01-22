/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.polymorphism;
import java.util.Scanner;

public class mainMenu {
    public static void main(String[]args){
        Scanner choice=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Software Books");
        System.out.println("2.Hardware Books");
        System.out.println("Enter the choice :");
        int a=choice.nextInt();
        switch(a)
        {
            case 1:softwareBooks sb=new softwareBooks();
                sb.getDetails();
                break;
            case 2: hardwareBooks hb=new hardwareBooks();
                hb.getDetails();
                break;
        }
    }
}
