package Arrays.Easy;

public class max_consecutive {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxcount=Math.max(count,maxcount);
            }else{
                count=0;
            }
        }
        System.out.println(maxcount);
    }
}
