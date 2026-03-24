package String;
import java.util.*;
public class longest_substring_without_repeating_character {
    public static boolean check(String str){
        int left=0;
        int right=str.length()-1;
        HashMap<Character,Integer>map = new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:str.toCharArray()){
            if(map.get(c)>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "bbbbb";
        HashSet<String>set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            for(int j=i;j<=str.length();j++){
                if(check(str.substring(i,j))){
                    set.add(str.substring(i,j));
                }
            }

        }
        String max ="";
        for(String s:set){
            if(max.length()<s.length()){
                max = s;
            }
        }
        System.out.println(max.length());
    }
    public static void optimal(String str){
        int left =0,maxlen=0;
        HashSet<Character>set=new HashSet<>();
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                
            }
        }
    }
}

