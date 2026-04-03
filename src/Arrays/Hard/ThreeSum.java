package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class ThreeSum {
    public static void optimal(int[] nums){
        List<List<Integer>>list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer>temp =Arrays.asList(nums[i],nums[j],nums[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while (j<k && nums[j]==nums[j-1])j++;
                    while (j<k && nums[k]==nums[k+1])k--;
                }
            }

        }
        System.out.println(list);
    }
    public static void better(int[] nums){
        HashSet<List<Integer>>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>temp =new HashSet<>();
            for(int j=i+1;j<nums.length;j++) {
                int third = -(nums[i]+nums[j]);
                if(temp.contains(third)){
                   List<Integer>templist = Arrays.asList(nums[i],nums[j],third);
                   Collections.sort(templist);
                   set.add(templist);
                }
                temp.add(nums[j]);
            }
        }
        System.out.println(set);
    }
    public static void bruteforce(int[] nums){

        HashSet<List<Integer>>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>>list= new ArrayList<>(set);
        System.out.println(list);
    }
    public static void main(String[] args){
        int[] nums={-1,0,1,2,-1,-4};
        bruteforce(nums);
        better(nums);
        optimal(nums);
    }
}
