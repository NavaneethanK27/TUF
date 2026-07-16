class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int[] prefixmax = new int[nums.length];
        prefixmax[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixmax[i] = Math.max(prefixmax[i - 1], nums[i]);
        }
       

        int[] prefixgcd = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prefixgcd[i]=gcd(nums[i],prefixmax[i]);
        }

        Arrays.sort(prefixgcd);
        int left=0;
        int right=prefixgcd.length-1;
        long sum=0;
        while(left<right){
            sum += gcd(prefixgcd[left],prefixgcd[right]);
            left++;
            right--;
        }
        return sum;
    }
}