package Arrays.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class move_zeros {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int pos = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        while(pos<n){
            arr[pos]=0;
            pos++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
