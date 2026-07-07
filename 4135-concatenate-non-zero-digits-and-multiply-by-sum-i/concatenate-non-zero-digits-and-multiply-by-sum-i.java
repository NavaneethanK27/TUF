class Solution {
    public static long reverse(long n){
        long rev = 0;
        while(n>0){
            long digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        while(n>0){
            long digit = n%10;
            if(digit!=0){
                sum+=digit;
                x = x*10+digit;
            }
            n=n/10;
        }
        return reverse(x)*sum;
    }
}