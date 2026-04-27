package Binary_search;

public class floor_and_ciel {
    public static int floor(int[] nums,int target){
           int low=0;
           int high=nums.length-1;
           int ans=0;
           while(low<=high){
               int mid = (low+high)/2;
               if(nums[mid]<=target){
                   ans=nums[mid];
                   low=mid+1;
               }else{
                   high=mid-1;
               }
           }
           return ans;
    }
    public static int ceiling(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else{
                ans=nums[mid];
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums={3, 4, 4, 7, 8, 10};
        int x=5;
        System.out.println(floor(nums,x));
        System.out.println(ceiling(nums,x));
    }
}
