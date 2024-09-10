
import java.util.Scanner;
public class P24_HollowHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number to generate Hollow diamond pattern:-");

        int n=sc.nextInt();
        
        int p=((n-3)*2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            
            if(i==1){
                for(int k=1;k<n;k++){
                    System.out.print(" *");
                }
            }

            if(i>1 && i<n){
            for(int j=1;j<=p;j++){
                System.out.print(" ");
               
            }
            System.out.print("*");
            p-=2;
            }

            System.out.println();
            
        }

        
        for(int i=1;i<n;i++){
            for(int s=i;s<n-1;s++){
                System.out.print(" ");
            }
            System.out.print("*");

           if(i<n-1){
            p+=2;
            for(int j=1;j<=p;j++){
                System.out.print(" ");
            }
            System.out.print("*");
           }

            if(i==n-1){
                for(int k=1;k<n;k++){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }



       



    }
}
