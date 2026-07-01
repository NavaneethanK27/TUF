class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer>q = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(Map.Entry<Integer,Integer>e:map.entrySet()){
           q.offer(e.getKey());

           if(q.size()>k){
            q.poll();
           }

        }

        int[] result = new int[q.size()];
        int index=0;
        while(!q.isEmpty()){
            result[index++]=q.poll();
        }

        System.out.println(q);
     
     return result;



    }
}