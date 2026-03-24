package Hashing;

import java.util.HashMap;

public class check_string {
    public static void  main(String[] args){
         String a="eacbd";
         String b="eabcd";
         HashMap<Character,Integer>map=new HashMap<>();
         for(int i=0;i<a.length();i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
            map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)-1);
         }
         for(int value:map.values()){
            if(value!=0){
                System.out.println("false");
                return;
            }
        }
        int i=a.length()-1;
        int j=b.length()-1;
        int count=0;
        while(i>=0){
            if(a.charAt(i)==b.charAt(j)){
                i--;
                j--;
            }
            else{
                i--;
                count++;
            }
        }
        System.out.println(count);
    }
}
