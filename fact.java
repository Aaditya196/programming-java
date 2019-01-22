
package display;

import java.util.Scanner;
public class fact {
    public static void main(String[]args){
        int STDIN,STDOUT,i;
        Scanner sc = new Scanner(System.in);
        STDIN =sc.nextInt();
        for(i=STDIN-1;i>1;i--){
            STDIN=STDIN*i;    
        }
        STDOUT = STDIN;
        System.out.println(STDOUT);
    }
}
