package Hashing;

import java.util.*;

public class Setwithoutinbuilt {
    public static void main(String[] args){
        String str="abbacca";
        String str1="I am cse Student";
        String[] strarr=str1.split(" ");
        char[] arr={'a','b','c'};
        HashSet<Character>st=new HashSet<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        LinkedHashMap<String,Integer>map2=new LinkedHashMap<>();
        int[] freq=new int[24];
        int n=str.length();
        for(int i=0;i<strarr.length;i++){
            map2.put(strarr[i],map2.getOrDefault(strarr[i],0)+1);
        }
        for(Map.Entry<String,Integer>e: map2.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        for(int i=0;i<n;i++) {
            char ch = str.charAt(i);
            st.add(ch);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            int index = ch - 'a';
            freq[index] = 1;
        }
        for(Map.Entry<Character,Integer>e: map1.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1) {
                System.out.print((char) (i + 'a'));
            }
        }
        System.out.println();
        for(char i:st){
            System.out.print(i);
        }
        System.out.println(Arrays.toString(st.toArray()));

    }
}
