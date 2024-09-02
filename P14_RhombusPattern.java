/*
        * * * *
         * * * *
          * * * *
           * * * *
            * * * *
 */


import  java.util.Scanner;



public class P14_RhombusPattern {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the number of row and column:=");

        int row = sc.nextInt();
        int col = sc.nextInt();

        sc.close();

        for(int i=0;i<row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }

            for(int k=1;k<=col;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
    }
}
