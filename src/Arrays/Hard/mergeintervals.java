package Arrays.Hard;
import java.util.*;
public class mergeintervals  {
    public static void optimal(int[][] arr){
        List<List<Integer>>result = new ArrayList<>();
        for(int[] interval:arr){
            if(result.isEmpty() || result.get(result.size()-1).get(1)<interval[0]){
                result.add(Arrays.asList(interval[0],interval[1]));
            }else {
                int last = result.size() - 1;
                int maxend = Math.max(result.get(last).get(1), interval[1]);
                result.get(last).set(1, maxend);
            }
        }
        System.out.println(result);
    }
    public static void brutefrce(int[][] arr){
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<List<Integer>>ans = new ArrayList<>();
        int n = arr.length;
        int i =0;
        while(i<n){
            int start=arr[i][0];
            int end = arr[i][1];

            int j=i+1;
            while(j<n && arr[j][0]<=end){
                end = Math.max(end,arr[j][1]);
                j++;
            }

            ans.add(Arrays.asList(start,end));
            i=j;
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        int[][] arr={{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        brutefrce(arr);
        optimal(arr);
    }
}
