package Arrays;

import java.util.HashSet;

public class Union_of_two_Arrays {
    static int[] optimalapproach(int[] nums1,int[] nums){
         //Two pointer
        return nums;
    }
    static HashSet<Integer> bruteforce(int[] nums1,int[] nums2){
        //time complexity: o(n1 log n + ns log n)+o(n1+n2)
        //space complexity: o(n1+n2) + o(n1+n2)
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums1) {
            set.add(i);
        }
        for(int i:nums2){
            set.add(i);
        }
        int n=set.size();
        return set;
    }
    public static void main(String[] args) {
       int[] nums1={1,1,2,3,4,5};
       int[] nums2={2,3,4,4,5,6};
       System.out.print(bruteforce(nums1,nums2));
    }
}
