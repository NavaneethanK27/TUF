package Binary_search;

public class first_and_last_Occurance {
    public static int firstOccurance(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                res=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
    public static int lastOccurance(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                res=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
    public static int[] occurance(int[] nums,int target){
        //Two Pointers
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
      System.out.println(firstOccurance(nums,target));
      System.out.println(lastOccurance(nums,target));
    }
}
