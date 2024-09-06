
import java.util.Scanner;

/*
 *     * * * * *
 *     * * * *
 *     * * *
 *     * *
 *     *
 *     * *
 *     * * * 
 *     * * * *
 *     * * * * *
 */

public class P17_Kpatterns {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the column number:-");

        int n=sc.nextInt();
        

        for(int i=0;i<(n*2)-1;i++){
            if(i<n){
                for(int j=0;j<n-i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k=n;k<=i+1;k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
