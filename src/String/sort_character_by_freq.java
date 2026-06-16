package String;

import java.util.*;

public class sort_character_by_freq {
    public static String sort(String str){
        StringBuilder result = new StringBuilder();
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character>[] bucket  = new List[str.length()+1];

        for(char c:map.keySet()){
            int freq=map.get(c);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(c);
        }

        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char ch:bucket[i]){
                    int freq=i;
                    while(freq-->0){
                        result.append(ch);
                    }
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        String str="tree";
        System.out.println(sort(str));
    }
}
