class Solution {
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        // int n=n*2;
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<n*2;i++){
          if(i%2==0){
            evensum+=i;
          }else{
            oddsum+=i;
          }
        }
        return gcd(evensum,oddsum);
    }
}