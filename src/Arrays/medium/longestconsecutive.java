
//Time Complexity: O(n), where n is the number of elements in the array. This is because we traverse each element once to build the set and then again to find the longest consecutive sequence.
//Space Complexity: O(n), as we use a set to store the unique elements of the array, which in the worst case can be equal to the size of the input array.
package Arrays.medium;

import java.util.HashSet;

public class longestconsecutive {
    public static void main(String[] args){
        int[] nums = {100, 4, 200, 1, 3, 2};
        HashSet<Integer>set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count=1;
        int maxcount=0;
        for(int i:set){
            if(!set.contains(i-1)){
                count =1;
                int curr=i;
                while (set.contains(curr+1)){
                    count++;
                    curr++;
                }
            }
            maxcount=Math.max(count,maxcount);
        }
        System.out.println(maxcount);
    }
}
