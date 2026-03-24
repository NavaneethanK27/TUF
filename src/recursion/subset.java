package recursion;
import java.util.*;
public class subset {
    public List<List<Integer>> subsetres(int[] nums){
        List<List<Integer>>result =  new ArrayList<>();
        backtracking(nums,0,new ArrayList<>(),result);
        return result;
    }
    public void backtracking(int[] nums,int start,List<Integer>current,List<List<Integer>>result){
        result.add(new ArrayList<>(current));
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtracking(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        subset sb = new subset();
        List<List<Integer>>res =  sb.subsetres(nums);
        System.out.print(res);
    }
}
