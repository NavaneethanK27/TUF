package Slidingwindow_And_two_pointer_combined_problem;

public class ConcentationString {
    public  static  boolean solution(String[] dictionary,String s){
       if(s.length()==0){
           return true;
       }
       for(String word:dictionary){
           if(s.startsWith(word)){
               String remaining = s.substring(word.length());
               if(solution(dictionary,remaining)){
                   return true;
               }
           }
       }
       return false;
    }
    public static void main(String[] args){
        String s = "ilike";
        String[] dictionary = {"i", "like", "gfg"};
        int n=dictionary.length;
        System.out.println(solution(dictionary,s));
    }
}
