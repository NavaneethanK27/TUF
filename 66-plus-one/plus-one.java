class Solution {
    public int[] plusOne(int[] num) {
        for(int i=num.length-1;i>=0;i--){
            if(num[i]<9) {
                num[i] = num[i] + 1;
                return num;
            }
            num[i]=0;
        }
        int[] res = new int[num.length+1];
        res[0]=1;
        return res;
    }
}