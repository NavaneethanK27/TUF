package Stack;
import java.util.*;
public class nextgreaterelement {
    public static void main(String[] args){
        int[] nums1 ={4,1,2};
        int[] nums2={1,3,4,2};

        Stack<Integer>st= new Stack<>();
        Map<Integer,Integer>map = new HashMap<>();

        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }

        while (!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = map.get(nums1[i]);
        }



        System.out.println(st);
        System.out.println(Arrays.toString(result));
    }
}
