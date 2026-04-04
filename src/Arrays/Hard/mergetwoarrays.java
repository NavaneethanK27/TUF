package Arrays.Hard;
import java.util.*;
public class mergetwoarrays {
    public static void optimal(int[] nums1,int[] nums2,int n,int m){
        int k = n+m-1;
        int left=n-1;
        int right=m-1;
        while(left>=0 && right>=0){
            if(nums1[left]>nums2[right]){
                nums1[k--]=nums1[left--];
            }else{
                nums1[k--]=nums2[right--];
            }
        }
        while(right>=0){
            nums1[k--]=nums2[right--];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void bruteforce(int[] nums1,int[] nums2,int n,int m){
        int index=0;
        while(n<nums1.length){
            nums1[n]=nums2[index];
            n++;
            index++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }
    public static void main(String[] args){
        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0} ;
        int[] nums2 = {-3, 1, 8};
        int n=4;
        int m=3;
        //bruteforce(nums1,nums2,n,m);
        optimal(nums1,nums2,n,m);
    }
}
