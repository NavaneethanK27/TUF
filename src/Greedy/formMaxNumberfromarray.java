package Greedy;

public class formMaxNumberfromarray {
    public static void main(String[] args){
        String[] arr ={"54","520","9","25"};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                String ab = arr[j] + arr[j+1];
                String ba = arr[j+1]+arr[j];

                if(Integer.parseInt(ab) < Integer.parseInt(ba)){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String result ="";
        for(String i:arr){
            result+=i;
        }
        System.out.println(result);
    }
}
