/*
 *  * * * * *
 *    * * * *
 *      * * *
 *        * * 
 *          *
 *        * *
 *      * * *
 *    * * * *
 *  * * * * *
 */

public class P18_OppositeKpattern {
    public static void main(String[] args) {
        
        
        int n=5;
        int p= n/2;
        

        for(int i=0;i<(n*2)-1;i++){
            if(i<n){
                for(int k=1;k<=i;k++){
                    System.out.print("  ");
                }
                for(int j=0;j<n-i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=i;j<=n+p;j++){
                    System.out.print("  ");
                }
                for(int k=n;k<=i+1;k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
