/*
 *  * * * * *
 *   *     *
 *    *   *
 *     * *
 *      *
 */


import java.util.Scanner;

public class P22_HollowReverseTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row:-");

        int n=sc.nextInt();

        int p=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            
            if(i==1){
                for(int k=1;k<n;k++){
                    System.out.print(" *");
                }
            }

            if(i>1 && i<n){
            for(int j=1;j<=p;j++){
                System.out.print(" ");
               
            }
            System.out.print("*");
            p-=2;
            }

            System.out.println();
            
        }



    }
}
