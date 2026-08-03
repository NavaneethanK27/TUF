class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int[] a:matrix){
           for(int i:a){
            pq.add(i);
           }
        }
        k--;
        while(k>0){
           k--;
           pq.poll();
        }
        return pq.poll();
    }
}