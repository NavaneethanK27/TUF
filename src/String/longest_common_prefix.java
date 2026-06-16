package String;
import java.util.*;
public class longest_common_prefix {
    public static void main(String[] args){
        String[] strs ={"flower","flow","flight"};
        Arrays.sort(strs);
        String prefix="";
        int n=strs.length;
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)!=strs[n-1].charAt(i)){
                break;
            }
            prefix+=strs[0].charAt(i);
        }
        System.out.println(prefix);
    }
}
