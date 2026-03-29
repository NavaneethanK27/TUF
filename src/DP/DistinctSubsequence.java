package DP;
import java.util.*;
public class DistinctSubsequence {
    public static void generate(int index,String s,StringBuilder current,List<String>result){
       if(index==s.length()){
           result.add(current.toString());
           return;
       }
       current.append(s.charAt(index));
       generate(index+1,s,current,result);
       current.deleteCharAt(current.length()-1);
       generate(index+1,s,current,result);
    }

    public static void main(String[] args){
        List<String>result =  new ArrayList<>();
        String s ="rabbbit";
        String t="rabbit";
        generate(0,s, new StringBuilder(""),result);
        int count =0;
        for(String i:result){
            if(i.equals(t)){
                 count++;
            }
        }
        System.out.println(result);
        System.out.println(count);
    }
}
