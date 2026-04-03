package Bit_manipulation;

import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args){
        int[] nums={3,2,3};
        int n = nums.length;
        int majority=n/2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>majority){
                System.out.println(key);
                return;
            }
        }
    }
}
