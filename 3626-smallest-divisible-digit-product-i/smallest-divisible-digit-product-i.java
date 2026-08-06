class Solution {
    public int sum(int digit){
        int sum = 1;
        while(digit>0){
           int temp = digit%10;
           sum*=temp;
           digit/=10;
        }
        return sum;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n*2;i++){
              if(sum(i)%t==0){
                return i;
              }
        }
        return t;
    }
}