package String;
import java.util.*;
public class Longestpalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer>map =new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean hasodd=false;

        for(int count:map.values()){
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                hasodd=true;
            }
        }
        if(hasodd){
            length=length+1;
        }
        System.out.println(length);

    }
}
