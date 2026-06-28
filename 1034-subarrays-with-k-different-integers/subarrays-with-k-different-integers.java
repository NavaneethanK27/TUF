class Solution {
    public int  check(int[] nums,int k){
    HashMap<Integer,Integer>map = new HashMap<>();
        int left=0,count=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(map.get(nums[right])==1){
                k--;
            }

            while(k<0){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    k++;
                }
                left++;
            }

            count+=(right-left+1);
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return check(nums,k)-check(nums,k-1);
    }
}