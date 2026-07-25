class Solution {
    public int maxProduct(int n) {
        int len = (int)Math.log10(n)+1;
        int[] arr = new int[len];
        int index  = len-1;
        while(n!=0){
            int digit = n%10;
            arr[index--] = digit;
            n=n/10;
        }
        Arrays.sort(arr);
        return arr[len-1]*arr[len-2];

    }
}