class Solution {
    public int count(int[] nums,int k){
        int sum = 0;
        int left=0;
        int res=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2!=0){
                k--;
            }

            while(k<0){
                if(nums[left]%2!=0){
                    k++;
                }
                left++;
            }
           res+= (right-left+1);
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
}