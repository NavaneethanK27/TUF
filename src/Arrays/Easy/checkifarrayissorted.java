package Arrays.Easy;

public class checkifarrayissorted {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
