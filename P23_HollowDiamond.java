/*
 *          *
 *         * *
 *        *   *
 *       *     *
 *      *       *
 *       *     *
 *        *   *
 *         * *
 *          *
 */
import java.util.Scanner;

public class P23_HollowDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number to generate Hollow diamond pattern:-");

        int n=sc.nextInt();
        int p=1;
        

        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1){
                for(int j=1;j<=p;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                p+=2;
                
            }
            System.out.println();
        }

        p-=4;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }
            System.out.print("*");
            
            for(int j=1;j<=p;j++){
                System.out.print(" ");
            }
            p-=2;
            
            if(i<n-1){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
    