package Bit_manipulation;

public class Findxorforgivenrange {
    public static void main(String[] args){
        int l=3,r=5;
        int xor =0;
        for(int i=l;i<=r;i++){
            xor^=i;
        }
        System.out.println(xor);
    }
}
