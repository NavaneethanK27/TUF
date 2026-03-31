package Arrays.Easy;

public class remove_duplicates_from_sorted_Array {
    public static void main(String[] args){
        int[] arr = {1,1,2};
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[index]!=arr[i]){
                index++;
                arr[index]=arr[i];
            }
        }
        System.out.println(index+1);
    }
}
