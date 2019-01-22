
package display;

import java.util.Scanner;

public class star {
    public static void main(String[]args){
        int rows,i,j;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. of rows u want : ");
        rows =sc.nextInt();
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
    
}
