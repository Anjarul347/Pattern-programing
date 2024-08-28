// 6.       *
//         **
//        ***
//       ****
//      *****

import java.util.Scanner;

public class P6_LowerRightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many row you want:-");
        int n = sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
