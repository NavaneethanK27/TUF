package recursion;

public class Check_array_is_sorted {
    public  static boolean sorted(int[] arr,int i){
        if(i==arr.length-1) return true;
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
    public static void main(String[] args){
        int[] arr = {1,9,3,4,5,6};
        int n=arr.length;
        boolean check=sorted(arr,0);
        System.out.println(check);

    }
}
