package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class top_K_Element {
    public static void main(String[] args){
        int[] nums={4,4,4,1,1,2,2,2};
        int k=2;
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] res=new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<k;i++){
            int maxfreq=0;
            int maxelement=0;
            for(int key:map.keySet()) {
                if (map.get(key) > maxfreq) {
                    maxfreq = map.get(key);
                    maxelement = key;
                }
            }
                res[i]=maxelement;
                map.remove(maxelement);
            }
        System.out.println(Arrays.toString(res));

    }
}
