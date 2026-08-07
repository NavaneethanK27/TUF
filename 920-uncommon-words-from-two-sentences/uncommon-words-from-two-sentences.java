class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map = new HashMap<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        for(String s:arr1){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s:arr2){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if(e.getValue()==1){
                result.add(e.getKey());
            }
        }
        
        String[] res = new String[result.size()];
        int i = 0;
        for(String s:result){
            res[i++] = s; 
        }

        return res;

    }
}