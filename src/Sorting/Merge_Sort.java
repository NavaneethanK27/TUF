package Sorting;
import java.util.*;
public class Merge_Sort {
    public static void merge_sort(int[] arr,int left,int right){
        if(left<right) {
            int mid = (left + right) / 2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int left_array_size = mid-left+1;
        System.out.println(left_array_size);
        int right_array_size = right-mid;

        int[] left_array = new int[left_array_size];
        int[] right_array = new int[right_array_size];

        for(int i=0;i<left_array_size;i++){
            left_array[i]=arr[left+i];
        }

        System.out.println("left: "+Arrays.toString(left_array));

        for(int i=0;i<right_array_size;i++){
            right_array[i]=arr[mid+i+1];
        }

        System.out.println("RIght: "+Arrays.toString(right_array));

        int i=0,j=0,k=left;

        while(i<left_array_size && j<right_array_size){

            if(left_array[i]<right_array[j]){
                arr[k]=left_array[i];
                i++;
            }else{
                arr[k]=right_array[j];
                j++;
            }
            k++;
        }

       while(i<left_array_size){
           arr[k]=left_array[i];
           i++;
           k++;
       }
       while (j<right_array_size){
           arr[k]=right_array[j];
           j++;
           k++;
       }
    }
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 3};
        merge_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
