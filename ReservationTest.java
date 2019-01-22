/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alchem;
import java . util.Scanner;
/**
 *
 * @author intex
 */
 class Reservation {
     int TicketID,initial_TicketID;
     public void ShowTicket()
     {
         Scanner sc;
         sc = new Scanner(System.in);
         TicketID= initial_TicketID;
         
         System.out.println("TicketID = Initial TicketID");
     }
     }
  public class ReservationTest{
      public static void main(String[]args){
          Reservation rn=new Reservation();
          rn.ShowTicket();
     }
     }
    

