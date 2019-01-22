/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;


public class Generic {
    
    public <M> M display(M value)
    {
      return value;
      
    }

    public static void main(String[] args) {
        Generic obj=new Generic();
        System.out.println("The generic method is used with string value: " +obj.display("Test"));
        System.out.println("The generic method is used with double value: " +obj.display(7.5));
        System.out.println("The generic method is used with boolean value: " +obj.display(true));
        System.out.println("The generic method is used with integer value: " +obj.display(10));
    }
    
}
