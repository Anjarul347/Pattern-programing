// 10.          
//             1
//            2 2
//           3 3 3
//          4 4 4 4


import java.util.Scanner; 

public class P10_NumberTriangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of row and column:-");
        int n=sc.nextInt();

        sc.close();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>n-i;k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
    
}
