package Arrays.medium;
import java.util.*;
public class Longestsubarrayzero {
    public static void main(String[] args){
        int[] arr = {9,-3,3,-1,6,-5};
        HashMap<Integer,Integer>map= new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxlen++;
            }
            else if(map.containsKey(sum)){
                maxlen = Math.max(maxlen,i-map.get(sum));
            }else{
               map.put(sum,i);
            }
        }
        System.out.print(maxlen);
    }
}
