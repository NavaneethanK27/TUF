package Hashing;

import java.util.HashSet;

public class Subsetchecking {
    public static  void main(String[] args){
        int[] arr1={1, 2};
        int[] arr2={1,2,3};
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        boolean issubset=false;
        for(int i:arr2) {
            if (set.contains(i)) {
                issubset = true;
            } else {
                issubset = false;
                break;
            }
        }
        System.out.println(issubset);
    }
}
