package recursion;
import java.util.*;
public class egg_problem {
    public static void optimize(int eggs,int floors){
        int[] arr = new int[eggs+1];

    }
     public static void moves(int eggs,int floors){
         int[][] dp = new int[eggs+1][floors+1];


         for(int i=0;i<=floors;i++){
             dp[0][i]=0;
             dp[1][i]=i;
         }
         for(int i=1;i<=eggs;i++){
             dp[i][0]=0;
             dp[i][1]=1;
         }

         for(int i=2;i<eggs+1;i++){
             for(int j=2;j<floors+1;j++){
                 dp[i][j] = Integer.MAX_VALUE;
                 for(int f=1;f<=j;f++){
                     int res = 1+Math.max(dp[i-1][f-1],dp[i][j-f]);
                     dp[i][j]=Math.min(res,dp[i][j]);
                 }
             }
         }
         for(int i=0;i<eggs+1;i++){
             for(int j=0;j<floors+1;j++){
                 System.out.print(dp[i][j]+" ");
             }System.out.println();
         }
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int eggs = sc.nextInt();
         int floors = sc.nextInt();
         moves(eggs,floors);
     }
}
