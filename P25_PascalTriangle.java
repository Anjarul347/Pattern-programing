
import java.util.Scanner; 
public class P25_PascalTriangle {

    public int factorial(int i){
        if(i==0){
            return 1;
        }
        return i* factorial(i-1);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        P25_PascalTriangle obj=new P25_PascalTriangle();

        System.out.println("Enter the number of row for Pascal triangle:-");

        int n=sc.nextInt();

        
        for(int i=0;i<=n;i++){
            for(int s=i;s<n-1;s++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print(" "+ obj.factorial(i)/(obj.factorial(i-j)*obj.factorial(j)));
            }
            
            System.out.println();


        }


    }
}
