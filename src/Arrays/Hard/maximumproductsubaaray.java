package Arrays.Hard;

public class maximumproductsubaaray {
    public static void brute_force(int[] nums){
        int product=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                max=Math.max(product,max);
            }
        }
        System.out.println(max);
    }
    public static void optimal(int[] nums){
//Time Complexity: O(N), every element of array is visited once.
//Space Complexity: O(1), constant number of variables are used.
        int prefix=1;
        int suffix=1;
        int n = nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=nums[i];
            suffix*=nums[n-i-1];
            ans=Math.max(ans,Math.max(prefix,suffix));
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        int[] nums={-2,0,-1};
        optimal(nums);
    }
}
