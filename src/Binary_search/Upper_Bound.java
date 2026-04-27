package Binary_search;
//Key Difference
//Lower Bound → ≥ x
//Upper Bound → > x
//🔥 Core Difference
//Condition	Meaning
//arr[mid] < x	skip all smaller → Lower Bound
//arr[mid] <= x	skip smaller + equal → Upper Bound
public class Upper_Bound {
    public static int upperbound(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr ={1, 3, 3, 5, 7};
        int x=3;
        System.out.println(upperbound(arr,x));
    }

}
