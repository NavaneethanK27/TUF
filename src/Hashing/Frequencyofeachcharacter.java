package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequencyofeachcharacter {
    public static void main(String[] args){
        HashMap<Character,Integer>map=new HashMap<>();
        String str="Vikraman";
        for(char i:str.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Character,Integer>e:map.entrySet()){
           System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
