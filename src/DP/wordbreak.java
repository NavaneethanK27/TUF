package DP;
import java.util.*;
public class Wordbreak {
    public static boolean check(String str,ArrayList<String>list){
        int n = str.length();
        HashSet<String>set= new HashSet<>(list);
        boolean[] dp = new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && set.contains(str.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        System.out.println(set);
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "leetcode";
        ArrayList<String>list = new ArrayList<>(Arrays.asList("leet","code"));
        System.out.println(list);
        System.out.println(check(str,list));

    }
}
