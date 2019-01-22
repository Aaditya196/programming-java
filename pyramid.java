
package display;

import java.util.Scanner;
public class pyramid {
public static void main(String[]args){
    int row = 0,i,j,k,space=1;
    
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter no. of rows : ");
    row=sc.nextInt();
    space=row;
    for(i=1;i<=row;i++){
        for(j=space;j>=i;j--){
            System.out.print(" ");
        }
        for(k=1;k<=i;k++){
            System.out.print(" *");
        }
        System.out.println();
    }
}    
}
