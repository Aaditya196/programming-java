
package exceptHandling;
import java .util.Scanner;
public class age {
    int ages;
    public void two(){
        Scanner sc =new Scanner(System.in);

        System.out.println(" ENTER YOUR AGE : " );
        ages =sc.nextInt();
        assert (ages > 20 && ages  < 55 ) ;

        System.out.println("THE ENTERED AGE IS : "+ages);
    }
    public static void main(String[]args){
    age a =new age();
    a.two();
    }
}
