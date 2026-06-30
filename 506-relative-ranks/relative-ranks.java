class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer>q = new PriorityQueue<>();
        for(int s:score){
            q.add(s);
        }

        int index = score.length;
        // int score = ;

        String[] result = new String[score.length];

        while(q.size()>0){
            int element = q.poll();
             
            for(int i=0;i<score.length;i++){
                if(element==score[i] ){
                   if(index>=4){
                    result[i] = index + "";
                    index--;
                   }else {
                       switch (index){
                       case 1:
                         result[i] = "Gold Medal";
                         break;
                       case 2:
                         result[i] = "Silver Medal";
                         break;
                       case 3:
                         result[i] = "Bronze Medal";
                         break;
                       default:
                          break;
                       }
                       index--;
                    }
                }
            }

        }
        return result;

    }
}