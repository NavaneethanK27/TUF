package Sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args){
        int[] arr = {9,3,7,5,6,1};
        int n =arr.length;
        for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               if(arr[i]>arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}
