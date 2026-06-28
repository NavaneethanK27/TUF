class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = Integer.MIN_VALUE;
        double sum = 0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            while((right-left+1)>k){
                sum-=nums[left];
                left++;
            }

            if((right-left+1)==k){
                average = Math.max(average,sum/k);
            }
        }

        return average;

    }
}