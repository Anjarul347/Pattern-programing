//     *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *


import java.util.Scanner;

public class P5_RightArrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any odd vumber of row to obtain proper output: ");
        
        
        //1st Way


        int in= sc.nextInt();
        int n=in/2;
        sc.close();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }






        //2nd Way


        // int n= sc.nextInt();
        // sc.close();
        // int r=2*n;
        // for(int i=1;i<=r;i++){
        //     if(i<=n){
        //         for(int j=1;j<=i;j++){
        //             System.out.print("* ");
        //         }
                
        //     }
        //     else{
        //         for(int j=n;j>=i;j--){
        //         System.out.print("* ");
        //         }

                
        //     }
        //     System.out.println();
        // }
    }
}
