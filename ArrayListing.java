/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListing {
    public static void main(String[]args)
    {
        ArrayList<String> obj=new ArrayList<String>();
        String sobj1=new String("Element 1");
        String sobj2=new String("Element 2");
        String sobj3=new String("Element 3");
        String sobj4=new String("Element 4");
        
        System.out.println("The size of array list is:" +obj.size()) ;
        
        obj.add(sobj1);
        obj.add(sobj2);
        obj.add(sobj3);
        obj.add(sobj4);
         System.out.println("\nArrayList after adding the objects: " +obj);
                 System.out.println("size of ArrayList after adding the objects: " +obj.size());
                 
                 obj.remove(sobj3);
                 obj.remove(sobj1);
                 
                   System.out.println("\nArrayList after removing the objects: " +obj);
                 System.out.println("size of Array List after removing the objects: " +obj.size());
                 
                 System.out.println("\nThe final ArrayList is: ");
                 ListIterator i =obj.listIterator();
                 while(i.hasNext())
                 {
                     System.out.println(i.next());
                 }
          
    }    
}
