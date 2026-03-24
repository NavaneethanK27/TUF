////2149. Rearrange Array Elements by Sign
//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

//        You should return the array of nums such that the array follows the given conditions:
//
//        Every consecutive pair of integers have opposite signs.
//        For all integers with the same sign, the order in which they were present in nums is preserved.
//        The rearranged array begins with a positive integer.
//    Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
//Example 1:
//        Input: nums = [3,1,-2,-5,2,-4]
//        Output: [3,-2,1,-5,2,-4]
//        Explanation:
//        The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
//        The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
//        Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.

package Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class rearrange_no_based_on_neg_pos {
    static  int[] variteyII(int[] arr){
        //TL=o(n)+o(m(pos,neg))+o(leftover)
        //if all values are neg or pos the leftover goes to o(n) and the o(o) for pos or neg
        //if pos==neg the leftover becomes zero o(0) the pos or neg becomes o(n/2)
        ArrayList<Integer>poslist=new ArrayList<Integer>();
        ArrayList<Integer>neglist=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                poslist.add(arr[i]);
            }
            else{
                neglist.add(arr[i]);
            }
        }
        if(poslist.size()>neglist.size()){
            for(int i=0;i<neglist.size();i++){
                arr[i*2]=poslist.get(i);
                arr[i*2+1]=neglist.get(i);
            }
            int index=neglist.size()*2;
            for(int i=neglist.size();i<poslist.size();i++){
                arr[index]=poslist.get(i);
                index++;
            }
        }
        else{
            for(int i=0;i<poslist.size();i++){
                arr[i*2]=poslist.get(i);
                arr[i*2+1]=neglist.get(i);
            }
            int index=poslist.size()*2;
            for(int i=poslist.size();i<neglist.size();i++){
                arr[index]=neglist.get(i);
                index++;
            }
        }
        return arr;
    }


    static int[] brute(int[] arr){
        //    Time Complexity: O(n+n/2)
        //    Space Complexity: O(n) (extra arrays used)
        int[] pos=new int[(arr.length/2)];
        int[] neg=new int[(arr.length/2)];
        int posindex=0;
        int negindex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos[posindex++]=arr[i];
            }
            else{
                neg[negindex++]=arr[i];
            }
        }
        for(int i=0;i<(arr.length/2);i++){
            arr[i*2]=pos[i];
            arr[i*2+1]=neg[i];
        }
        return arr;
    }
    static  int[] optimal(int[] arr){
        int[] pos=new int[(arr.length/2)];
        int[] neg=new int[(arr.length/2)];
        int posindex=0;
        int negindex=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[posindex]=arr[i];
                posindex+=2;
            }
            else{
                arr[negindex]=arr[i];
                negindex+=2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int[] res=brute(arr);
        int[] opt=optimal(arr);
        System.out.println("brute force: "+Arrays.toString(res));
        System.out.println("Optimal force: "+Arrays.toString(opt));
        int[] variteyII={1,-2,-3,4,-2,-4};
        System.out.println("VarietyII: "+Arrays.toString(variteyII(variteyII)));
    }
}
