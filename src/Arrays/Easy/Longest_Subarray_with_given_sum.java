package Arrays.Easy;
import java.util.*;
public class Longest_Subarray_with_given_sum {
    public static void main(String[] args){

    int[] nums = {10, 5, 2, 7, 1, 9};
    int k = 15;
    int n = nums.length;
    int maxlen = 0;
    int left = 0;
    int right = 0;
    int sum = nums[0];

    while(right<n){

        while(left<=right && sum>k){
            sum-=nums[left];
            left++;
        }

        if(sum==k){
            maxlen = Math.max(maxlen,right-left+1);
        }

        right++;

        if(right<n){
            sum+=nums[right];
        }
    }
    System.out.println(maxlen);

    }
}
