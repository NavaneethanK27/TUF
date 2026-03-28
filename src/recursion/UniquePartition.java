package recursion;

import java.util.*;

public class UniquePartition {
    public static ArrayList<ArrayList<Integer>>  partition(int n){
        ArrayList<ArrayList<Integer>>result = new ArrayList<>();
        ArrayList<Integer>current;
        backtracking(n,1,new ArrayList<>(),result);
        return result;
    }
    public static void backtracking(int target,int start,ArrayList<Integer> current,ArrayList<ArrayList<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=target;i++){
            current.add(i);
            backtracking(target-i,i,current,result);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<ArrayList<Integer>>list = partition(n);
      for(ArrayList<Integer> i:list){
          System.out.println(i);
      }
    }
}
