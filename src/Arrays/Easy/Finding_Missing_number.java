package Arrays.Easy;

public class Finding_Missing_number {
    public static void main(String[] args){
        int[] arr = {8,2,4,5,3,7,1};
        int total = 0;
        for(int i:arr){
            total+=i;
        }

        int n = arr.length+1;
        int expsum = n*(n+1)/2;

        System.out.println(expsum-total);

    }
}
