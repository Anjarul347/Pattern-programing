/*
 *  1 2 3 4 5
 *   2 3 4 5
 *    3 4 5
 *     4 5
 *      5
 *     4 5
 *    3 4 5
 *   2 3 4 5
 *  1 2 3 4 5
 */

import java.util.Scanner;
public class P21_MirrorImageReversTriangle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ente the number of row:-");

    int n=sc.nextInt();


    for(int i=1;i<=n;i++){
        for(int s=1;s<i;s++){
            System.out.print(" ");

        }
        for(int j=i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    for(int i=1;i<n;i++){
        for(int s=i;s<n-1;s++){
            System.out.print(" ");
        }
        for(int j=n-i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   
}
}
