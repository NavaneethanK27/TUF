package Stack.problems;

import java.util.Arrays;
import java.util.Stack;
//Time and space complexity is o(n)
public class Next_greater_element {
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 4};
        int[] result=new int[arr.length];
        Stack<Integer>st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));

    }
}
