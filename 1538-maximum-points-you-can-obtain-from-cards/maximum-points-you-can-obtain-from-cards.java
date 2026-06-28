class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        int total=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
           total+=cardPoints[i];
        }
        max = total;  
        for(int i=0;i<k;i++){
            total-=cardPoints[k-1-i];
            total+=cardPoints[n-1-i];

            max=Math.max(max,total);
        }
        return max;
        
    }
}