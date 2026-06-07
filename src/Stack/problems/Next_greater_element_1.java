package Stack.problems;
import java.util.*;
public class Next_greater_element_1 {
    public  static void solution(int[] nums1,int[] nums2){
        Stack<Integer>st = new Stack<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args){

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        solution(nums1,nums2);


    }
}
