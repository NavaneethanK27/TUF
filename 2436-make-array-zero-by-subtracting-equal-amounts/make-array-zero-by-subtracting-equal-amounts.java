class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        // PriorityQueue<Integer>q = new PriorityQueue<>();
        
        int operation = 0;
        
        while(true){

            PriorityQueue<Integer>q = new PriorityQueue<>();
            
            for(int e:nums){
                if(e>0){
                    q.add(e);
                }
            }

            if(q.isEmpty()){
                break;
            }

            int element = q.poll();
            for(int i=0;i<n;i++){
             if(nums[i]>0){
               nums[i] = nums[i]-element;
             }
            }
            operation++;
        }

        return operation;
    }
}