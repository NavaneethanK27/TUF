package Arrays.medium;
import java.util.*;
public class rearrange_the_array_by_sign {
    public static void main(String[] args){
        int[] arr={3,1,-2,-5,2,-4};
        int[] res=new int[arr.length];
        int posindex=0;
        int negindex=1;
        for(int i:arr){
            if(i>=0){
                res[posindex]=i;
                posindex+=2;
            }else{
                res[negindex]=i;
                negindex+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
