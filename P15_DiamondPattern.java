
import java.util.Scanner;

/*
               *
              * *
             * * *
            * * * *
             * * *
              * *
               *
 */

public class P15_DiamondPattern {

    public static void main(String[] args) {
        
        
        //........First Approach.........

        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }

            for(int k=n;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

//...........2nd Approach.................
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of column:-");

        int col=sc.nextInt();

        int row=(col*2)-1;


        for(int i=1;i<=row;i++){
            if(i<=col){
                for(int j=1;j<=col-i;j++){
                    System.out.print(" ");

                }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            else{
                for(int j=1;j<=i-col;j++){
                    System.out.print(" ");

                }
                for(int l=i-col;l<col;l++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    
}
