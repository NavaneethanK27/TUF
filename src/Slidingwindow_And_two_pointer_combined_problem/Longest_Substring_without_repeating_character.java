package Slidingwindow_And_two_pointer_combined_problem;

import java.util.HashSet;

public class Longest_Substring_without_repeating_character {
    public static void main(String[] args){
        String s = "abcabcbb";
        int maxlen=0;
        int left=0;
        HashSet<Character>set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }
        System.out.println(maxlen);
    }

}
