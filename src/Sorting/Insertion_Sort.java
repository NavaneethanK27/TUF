package Sorting;

import java.util.Arrays;

//Time & Space Complexity
//Case	Time
//Best (already sorted)	O(n)
//Average	O(n²)
//Worst (reverse sorted)	O(n²)
//
//Space: O(1) (in-place)
//
//Stable: ✅ Yes

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={8,3,4,1,3,5};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.print(Arrays.toString(arr));
    }
}
