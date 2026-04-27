package Binary_search;

public class first_and_last_Occurance {
    public static int[] occurance(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]!=target){
                left++;
            }else if(nums[right]!=target){
                right--;
            }else{
                return new int[]{left,right};
            }}
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
      int[] nums={5,7,7,8,8,10};
      int target=8;
      int[] res=occurance(nums,target);
      System.out.println(res[0]+" "+res[1]);
    }
}
