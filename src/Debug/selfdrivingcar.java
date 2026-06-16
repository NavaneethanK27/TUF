package Debug;
import java.util.*;
public class selfdrivingcar {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        int n=nums.length;
        List<Integer>small = new ArrayList<>();
        List<Integer>large = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                small.add(nums[i]);
            }
            else if(nums[i]>=pivot ){
                large.add(nums[i]);
            }
        }
//        Collections.sort(small);
        Collections.sort(large);
        int[] res = new int[n];
        int index=0;
        for(int i=0;i<small.size();i++){
            res[index++]=small.get(i);
        }
        for(int i=0;i<large.size();i++){
            res[index++]=large.get(i);
        }
        System.out.println(Arrays.toString(res));



    }
}
