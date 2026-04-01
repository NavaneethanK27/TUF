package Arrays.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class next_permuntation {
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr =new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index=-1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
        }else{
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[index]){
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    reverse(arr,index+1,n-1);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
