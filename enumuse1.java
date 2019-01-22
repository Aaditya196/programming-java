
package display;

 class enumuse {
 enum Mango{carrie(10),Fairchild(9),haden(12) ;
   private int price;
       Mango(int p)
       {
           price=p;
       }
       int getPrice()
       {
           return price ;
       }
 }
    
}
enum Mango {carrie,Fairchild,haden};
public class enumuse1 {
    public static void main(String[]args){
        for( Mango p : Mango.values())
        {
            System.out.println(p);
        }
    }
}