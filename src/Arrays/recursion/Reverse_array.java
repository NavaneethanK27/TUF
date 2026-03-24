package Arrays.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public void reverse(int[] arr,int start,int end){
        if(start>=end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;

        reverse(arr,start+1,end-1);
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         Reverse_array ra =  new Reverse_array();
         ra.reverse(arr,0,n-1);
         System.out.println(Arrays.toString(arr));
    }

}
