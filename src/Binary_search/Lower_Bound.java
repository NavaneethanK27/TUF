package Binary_search;
//What is lower bound?
//The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
//
//The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
public class Lower_Bound {
    public static int lowerbound(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;

    }
    public static void main(String[] args){
        int[] arr ={1,2,2,3};
        int x=2;
        System.out.println(lowerbound(arr,x));
    }
}
