/*
 *              *
 *             * *
 *            *   *
 *           *     *
 *          *********
 */
import java.util.Scanner;

public class P19_HollowTriangle {
    public static void main(String[] args) {
        System.out.println("Enter number of row you you wan:-");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;

        for(int i=1; i<=n;i++) {
       
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            if(i>1 && i<n){
                for(int l=1;l<=p;l++){
                    System.out.print(" ");
                }
                p+=2;
                System.out.print("*");
            }   

            if(i==n){
                for(int k=1;k<=(n*2)-2;k++){
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }
    }
}
