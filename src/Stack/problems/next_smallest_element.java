package Stack.problems;

import java.util.HashMap;
import java.util.*;

public class next_smallest_element {
    public static void solution(int[] arr){
        Stack<Integer>st = new Stack<>();
        int[] res = new int[arr.length];
        Arrays.fill(res,-1);
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args){
        int[] arr = {4, 8, 5, 2, 25};
        solution(arr);

    }
}
