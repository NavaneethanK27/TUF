package Slidingwindow_And_two_pointer_combined_problem;

public class max_consecutive_ones {
    public static int brute_force(int[] arr,int k){
        //o(n2)
        int n=arr.length;
        int maxlen=0;
        for(int i=0;i<n;i++){
            int zero=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0){
                    zero++;
                }
                if(zero<=k){
                    int len=j-i+1;
                    maxlen=Math.max(len,maxlen);
                }else{
                    break;
                }
            }
        }
        return maxlen;
    }
    public static int optimal(int[] arr,int k){
        int maxlen=0;
        int left=0;
        int zerocount=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                zerocount++;
            }
            if(zerocount>k){
                if(arr[left]==0){
                    zerocount--;
                }
                left++;
            }
            int len = right-left+1;
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int n=arr.length;
        int maxlen1=brute_force(arr,k);
        int maxlen2=optimal(arr,k);
        System.out.println(maxlen1);
        System.out.println(maxlen2);

    }
}
