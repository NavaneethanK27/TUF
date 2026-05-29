package recursion;

public class check_given_array_is_sorted {
    public static boolean check(int[] arr,int index){
        if(index==arr.length-1){
            return  true;
        }
        return arr[index]<arr[index+1] && check(arr,index+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,9,6};
        System.out.println(check(arr,0));
    }
}
