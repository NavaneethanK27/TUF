package Arrays.medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class leaders {
    public static void main(String[] args){
        int[] nums ={4, 7, 1, 0};
        if(nums.length==0){
            System.out.println(0);
            return;
        }
        ArrayList<Integer>list=new ArrayList<>();
        int max = nums[nums.length-1];
        list.add(max);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>max){
                list.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
