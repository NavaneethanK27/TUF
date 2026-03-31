package Arrays.medium;

public class sort_arrray_0_1_2 {
    public static void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public static void main(String[] args){
        int[] nums = {1,0,2,1,0};
        int low=0,mid=0,high=nums.length-1;

        while (mid<=high){

            if(nums[mid]==0){
                swap(nums,low,mid);
            }else if(nums[mid]==1){
                mid++;
            }else{
               swap(nums,high,mid);
            }
        }
    }
}
