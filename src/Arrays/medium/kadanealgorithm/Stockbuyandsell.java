package Arrays.medium.kadanealgorithm;

public class Stockbuyandsell {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int price:prices){
            if(minprice>price){
                minprice=price;
            }else{
                maxprofit=Math.max(maxprofit,price-minprice);;
            }
        }
        System.out.println(maxprofit);
    }
}
