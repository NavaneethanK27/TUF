package Slidingwindow_And_two_pointer_combined_problem;

import java.util.HashMap;

//Write a function to calculate the maximum number of fruits you can collect from an integer array fruits,
// where each element represents a type of fruit.
// You can start collecting fruits from any position in the array,
// but you must stop once you encounter a third distinct type of fruit.
// The goal is to find the longest subarray where at most two different types of fruits are collected.
//Example:
//Input: fruits = [3, 3, 2, 1, 2, 1, 0]
//Output: 4
//Explanation: We can pick up 4 fruit from the subarray [2, 1, 2, 1]
public class Fruits {
    public static void main(String[] args) {
        int[] fruits = {3, 3, 2, 1, 2, 1, 0};
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxcount=0;

        for(int i:fruits){
            map.put(i,map.getOrDefault(i,0)+1);
        }




    }
}
