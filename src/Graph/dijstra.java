package Graph;
import java.util.*;
public class dijstra {
    public int minimum(int[] dist,boolean[] visted){
        int min = Integer.MAX_VALUE;
        int min_index=-1;
        for(int i=0;i< visted.length;i++){
            if(!visted[i] && dist[i]<min){
                min = dist[i];
                min_index=i;
            }
        }
        return min_index;
    }
    public void calculatedistance(){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    }
}
