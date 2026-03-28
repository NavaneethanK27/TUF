package Arrays.medium;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    static int optimalsoln(int[] arr){

        HashSet<Integer>set = new HashSet<>();
        int maxcount=1;
        for(int i:arr){
           set.add(i);
        }
        for(int num:arr){
            if(!set.contains(num-1)){
                int curr=num;
                int count=1;
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                maxcount=Math.max(count,maxcount);
            }
        }
        return maxcount+1;
    }
    static int betterapproach(int[] arr){
        if(arr.length==0)return 0;
        Arrays.sort(arr);
        int n=arr.length;
        int lastSmallest=Integer.MIN_VALUE;
        int cnt=0;
        int longest=1;
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastSmallest){
                cnt=cnt+1;
                lastSmallest=arr[i];
            }
            else if(lastSmallest!=arr[i]){
                cnt=1;
                lastSmallest=arr[i];
            }
            longest=Math.max(cnt,longest);
        }
        return longest;
    }
    static boolean check(int[] arr,int x,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    static int bruteforce(int[] arr){
//        Time Complexity
//
//        check() → O(n)
//
//        Outer loop → O(n)
//
//        Inner while (worst case) → O(n)
//
//👉 Overall Time Complexity:
//        O(n³) (very slow for large inputs)
//
//        Space Complexity
//
//        No extra data structures used
//👉      O(1)
        int maxcount=1;
        int x=0;
        int current=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            x=arr[i];
            current=1;
            while(check(arr,x+1,n)==true){
                x=x+1;
                current++;
            }
            maxcount=Math.max(current,maxcount);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,2};
//        System.out.println(bruteforce(arr));
  //      System.out.println(betterapproach(arr));
        System.out.println(optimalsoln(arr));
    }
}
