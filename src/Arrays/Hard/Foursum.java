package Arrays.Hard;

import java.util.*;

public class Foursum {
    public static void main(String[] args){
       int[] nums= {1,0,-1,0,-2,2};
       HashSet<List<Integer>>result = new HashSet<>();
       int target=0;
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               HashSet<Integer>set = new HashSet<>();
               for(int k=j+1;k<nums.length;k++){
                  int sum = nums[i]+nums[j];
                  sum+=nums[k];
                  int need = target-sum;
                  if(set.contains(need)){
                      List<Integer>list=Arrays.asList(nums[i],nums[j],nums[k],need);
                      Collections.sort(list);
                      result.add(list);
                  }
                  set.add(nums[k]);
               }
           }

       }
        System.out.println(result);
    }

}
