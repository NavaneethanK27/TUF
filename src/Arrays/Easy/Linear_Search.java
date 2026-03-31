package Arrays.Easy;

public class Linear_Search {
    public static void main(String[] args){
        int[] arr ={1,2,4,5,6};
        int target = 4;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.println(index);
    }
}
