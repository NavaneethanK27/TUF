package Arrays.Easy;

import java.util.HashMap;

public class LongestSubarrayequaltozero {
    public static void main(String[] args){
        int[] nums ={9, -3, 3, -1, 6, -5};
        int n=6;

        HashMap<Integer,Integer>map = new HashMap<>();

        int sum =0;
        int maxLen = 0;

        for(int i=0;i<n;i++) {
            sum += nums[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }
}
