class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left <= right){
            if(nums[left] != target){
                left++;
            }else if(nums[right] != target){
                right--;
            }else if(nums[left] == target && nums[right]==target){
                return new int[] {left,right};
            }

        }
        return new int[]{-1,-1};
    }
}