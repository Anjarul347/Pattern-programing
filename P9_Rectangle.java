/*         
          * * * * *
          *       *
          *       * 
          *       *
          * * * * *
 */

import java.util.Scanner;

public class P9_Rectangle {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row:-");
        int n=sc.nextInt();
        sc.close();

        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(i==1 || j==1){
                System.out.print("* ");
            }
            else if(i==n || j==n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
        }
    }
}
 