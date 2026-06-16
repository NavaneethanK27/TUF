package Stack.problems;

public class TrappingRain_Water {
    public static int optimal(int[] height){
        int n= height.length;
        int left=0;
        int right=n-1;
        int maxleft=0;
        int maxright=0;
        int total=0;
        while(left<=right){
            if(height[left]<=height[right]){
               if(height[left]>=maxleft){
                   maxleft=height[left];
               }else{
                   total+=maxleft-height[left];
               }
               left++;
            }else{
                if(height[right]>=maxright){
                    maxright=height[right];
                }else{
                    total+=maxright-height[right];
                }
                right--;
            }
        }
        return  total;
    }
    public static int brute_force(int[] height){
        int n = height.length;
        int maxleft=0;
        int maxright=0;
        int total=0;
        for(int i=0;i<n;i++){
            maxleft=0;
            maxright=0;
            for(int j=0;j<=i;j++){
                maxleft = Math.max(height[j],maxleft);
            }
            for(int j=i;j<n;j++){
                maxright = Math.max(height[j],maxright);
            }

            total += Math.min(maxleft,maxright)-height[i];
        }
        return total;
    }
    public static void main(String[] args){
        int[] nums1 = {4,2,0,3,2,5};
        System.out.println(optimal(nums1));
    }
}
