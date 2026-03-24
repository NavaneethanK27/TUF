package Bit_manipulation;

public class single_number {
    public static void main(String[] args) {
        int[] num ={1,2,4,1,2};
        int xor=0;
        for(int i:num){
            xor^=i;
        }
        System.out.println(xor);
    }
}
