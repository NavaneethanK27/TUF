class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>q = new PriorityQueue<>((a,b)->b-a);

        for(int i:stones){
            q.add(i);
        }

        while(q.size()>1){
           int first = q.poll();
           int second = q.poll();

           if(first!=second){
               q.offer(first-second);
           }
        }

        return q.isEmpty()?0:q.peek();
    }
}