package DP;
import java.util.*;
public class Longest_Increasing_Subsquence {
    public static void main(String[] args){
        int[] nums = {7,7,7,7,7,7,7};
        int n = nums.length;
        int[] dp = new int[n];
        int max = 1;
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}
