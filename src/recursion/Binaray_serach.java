package recursion;

public class Binaray_serach {
    public static  int bs(int[] arr,int left,int right,int target){
        if(left>right) return -1;
        int mid=left + (right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return bs(arr,left,mid-1,target);
        }else{
            return bs(arr,mid+1,right,target);
        }
    }
    public  static  void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7};
        System.out.println( bs(arr,0,arr.length-1,5));

    }
}
