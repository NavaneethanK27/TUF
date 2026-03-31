package Arrays.Easy;

public class single_number {
    public static void main(String[] args){
        int[] arr={1,1,2};
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        System.out.println(xor);
    }
}
