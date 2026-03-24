package Greedy;
import java.util.*;
public class coinchange {
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int target = 11;

        int[] dp = new int[target+1];
        Arrays.fill(dp,target+1);

        dp[0] = 0;
        for(int i=1;i<=target;i++){
            for(int coin:coins){
                if(i>=coin){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        if(dp[target]>target){
            System.out.print("-1");
            return;
        }
        System.out.println(dp[target]);

    }
}
