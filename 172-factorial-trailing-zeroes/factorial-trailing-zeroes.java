class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        for(long  divisor=5;divisor<=n;divisor*=5){
            ans+= n/divisor;
        }
        return ans;
    }
}