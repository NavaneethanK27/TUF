package Arrays.medium.kadanealgorithm;

public class maximumsubarraysum {
    public static void main(String[] args){
        int[] arr={2, 3, 5, -2, 7, -4};
        int maxsum=0;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum=Math.max(arr[i],arr[i]+currsum);
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println(maxsum);
    }
}
