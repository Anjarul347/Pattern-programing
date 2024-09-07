
import java.util.Scanner;

public class P20_ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the number of row:-");

        int n=sc.nextInt();


        for(int i=1;i<=n;i++){
            for(int s=1;s<i;s++){
                System.out.print(" ");

            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
