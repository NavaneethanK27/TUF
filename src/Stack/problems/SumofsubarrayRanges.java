package Stack.problems;

import java.util.Stack;

public class SumofsubarrayRanges {
    public static  int[]  find_nge(int[] arr){
        Stack<Integer>st = new Stack<>();
        int n=arr.length;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=n;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return  ans;
    }
    public static int[] findPGEE(int[] arr){
        Stack<Integer>st = new Stack<>();
        int n=arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return  ans;
    }
    public static int[] find_NSE(int[] arr){
        Stack<Integer>st = new Stack<>();
        int n=arr.length;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=n;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return  ans;
    }
    public static int[] find_previous_smallest(int[] arr){
        Stack<Integer>st = new Stack<>();
        int n=arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return  ans;
    }
    public  static int Findmaximumsum(int[] arr){
        int[] nge = find_nge(arr);
        int[] pge = findPGEE(arr);
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int left = i-pge[i];
            int right = nge[i]-i;
            long freq = (long) right * left;
            sum += (int) (freq*arr[i]);
        }
        return sum;
    }
    public static int Findminimumsum(int[] arr){
        int[] nse = find_NSE(arr);
        int[] pse = find_previous_smallest(arr);
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int left = i-pse[i];
            int right = nse[i]-i;
            long freq = (long) right * left;
            sum += (int) (freq*arr[i]);
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int result =(Findmaximumsum(arr)-Findminimumsum(arr));
        System.out.println(result);
    }
}
