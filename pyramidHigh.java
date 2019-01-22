
package display;

import java.util.Scanner;
public class pyramidHigh {
    public static void main(String[]args){
        int N,i,j,l,x=6,y=22;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER the number of rows:");
        N =sc.nextInt();
      
        for(i=0;i<=N-1;i++){
            for(j=N-1;j>i;j--){
                System.out.print("  ");
            }
            for(l=0;l<=i;l++){
                System.out.print(""+x);
                x=x+y;
                y=y+16;
            }
            System.out.println();
        }     
    }
}

