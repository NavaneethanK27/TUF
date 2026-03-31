package Arrays.Easy;

import java.util.HashSet;

public class Union_of_Array {
    public static void main(String[] args){
        int n=5;
        int m=5;
        int[] arr1 ={1,2,3,4,5};
        int[] arr2={2,3,4,4,5};
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }

        for(int s:set){
            System.out.print(s+" ");
        }

    }
}
