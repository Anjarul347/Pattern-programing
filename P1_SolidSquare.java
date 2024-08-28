
// 1.  *****
//     *****
//     *****
//     *****
//     *****

import java.util.Scanner;

public class P1_SolidSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of row and column:-");
        int n =sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         
    }
}
