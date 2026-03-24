package DP;

public class Parition_equal_subset_sum {
    public static void main(String[] args){
        int[] nums = {1,5,11,5};
        int total  = 0;
        for(int i:nums){
            total+=i;
        }
        if(total%2!=0){
            System.out.println("False");
            return;
        }
        int target = total / 2;
        boolean[] dp = new boolean[target+1];
        dp[0]=true;
        for(int num:nums){
            for(int i=target;i>=num;i--){
                dp[i]=dp[i]||dp[i-num];
            }
        }
        System.out.println(dp[target]);
    }
}
