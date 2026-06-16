package Stack.problems;
import java.util.*;
class solution{
    //Function to find the next smaller element
    public static int[] findnse(int[] arr){
        Stack<Integer>stack = new Stack<>();
        int n=arr.length;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()  && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=n;
            }else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    // Function to find indices of Previous Smaller or Equal Element (PSEE)

    public static int[] findpse(int[] arr){
        Stack<Integer>stack = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
             while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                 stack.pop();
             }
             ans[i]=!stack.isEmpty()?stack.peek():-1;
            stack.push(i);
        }
        return ans;
    }

    public static int soln(int[] arr){
        int result=0;
        int[] nse =findnse(arr);
        int[] pse = findpse(arr);
        int n=arr.length;
        int mod = (int)1e9+7;
        int sum=0;
        for(int i=0;i<n;i++){
           int left = i-pse[i];
           int right = nse[i]-i;
           long freq = (long) left *right*1;
           long val =(int)(freq*arr[i]%mod);
           sum = (int)(sum+val)%mod;
        }
        return sum;
    }
}
public class Sum_of_Subarray_Minimums {
    public static void bruteforce(int[] arr){
        int total=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    min=Math.min(min,arr[k]);
                }
                total+=min;
            }
        }
        System.out.println(total);
    }
    public static void main(String[] args){
        int[] arr ={3,1,2,4};
        bruteforce(arr);
//        solution sn = new solution();
//        solution.findpse(arr);
        System.out.println(solution.soln(arr));
    }
}
