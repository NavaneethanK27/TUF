package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotation_of_array {
    public static void reverse(int[] arr,int left,int right){
       while(left<right){
           int temp =  arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
       }
    }
    public static void rotateleft(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void rightroate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void main(String[] args){
        int[] arr  = {1,2,3,4,5};
        int k = 2;
        rotateleft(arr,k);
        System.out.println(Arrays.toString(arr));
        rightroate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
