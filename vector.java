/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;
import java.util.ListIterator;
import java.util.Vector;


public class vector {
    public static void main(String[]args)
    {
      Vector<Double> obj=new Vector<Double>();
        Double dobj1=new Double(77.5);
        Double dobj2=new Double(38.2);
        Double dobj3=new Double(46.7);
        Double dobj4=new Double(79.8);
        
        System.out.println("The size of vector is:" +obj.size()) ;
        
        obj.add(dobj1);
        obj.add(dobj2);
        obj.add(dobj3);
        obj.add(dobj4);
         System.out.println("\nVector after adding the objects: " +obj);
                 System.out.println("size of Vector after adding the objects: " +obj.size());
                 
                 obj.remove(dobj3);
                 obj.remove(dobj1);
                 
                   System.out.println("\nVector after removing the objects: " +obj);
                 System.out.println("size of Vector after removing the objects: " +obj.size());
                 
                 System.out.println("\nThe final Vector is: ");
                 ListIterator i =obj.listIterator();
                 while(i.hasNext())
                 {
                     System.out.println(i.next());
                 }
          
    }    
}
  
    
            
    

