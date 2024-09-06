
import java.util.Scanner;

/*
    *          *
    * *      * *
    * * *  * * * 
    * *      * *
    *          *
 */

public class P16_Butterfliy_pattern {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any odd row number:-");
        
        int n=sc.nextInt();
        int d = n/2;
        int p = n+1;

        for(int i=0;i<n;i++){
            if(i<=d){
                p-=2; 
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                for(int k=1;k<=p;k++){
                    System.out.print("  ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                p+=2;
                for(int j=1;j<=d;j++){
                    System.out.print("* ");
                }
                for(int k=1;k<=p;k++){
                    System.out.print("  ");

                }
                for(int j=1;j<=d;j++){
                    System.out.print("* ");
                }
                d-=1;
                
            }
            System.out.println();

        }

        
    }
    
}
