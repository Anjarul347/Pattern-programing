/*
                 1
               2 1 2
             3 2 1 2 3
           4 3 2 1 2 3 4
  */


import java.util.Scanner;
public class P13_PallindromTriangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of row and column:-");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            //Printing the Space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int k=i;k>=1;k--){
                System.out.print(k + " ");
            }

            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
                    
            
            System.out.println();

        }

    }
}
