class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        backtracking(nums,0,new ArrayList<>(),list);
        return list;
    }

    public void backtracking(int[] nums,int start,List<Integer>current,List<List<Integer>>result){

        result.add(new ArrayList<>(current));

        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtracking(nums,i+1,current,result);
            current.remove(current.size()-1);
        }

    }
}