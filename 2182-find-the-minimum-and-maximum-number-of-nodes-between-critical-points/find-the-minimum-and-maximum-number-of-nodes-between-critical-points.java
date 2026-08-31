/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
         if(head.next.next == null || head.next==null){
            return new int[]{-1,-1};
        }

        List<Integer>result = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode front = head.next.next;
        int index = 2;
        while(front!=null){
         if((prev.val>curr.val && curr.val<front.val) || (prev.val<curr.val && curr.val>front.val)){
            result.add(index);
         }
         prev=prev.next;
         curr=curr.next;
         front=front.next;
         index++;
        }
        if(result.size()<=1){
            return new int[]{-1,-1};
        }
        System.out.println(result);
        int[] res = new int[2];
        res[1] = Math.abs(result.get(0)-result.get(result.size()-1));
        int min = Integer.MAX_VALUE;
        for(int i=0;i<result.size()-1;i++){
           min = Math.min(min,result.get(i+1)-result.get(i));
        }
        res[0] = min;
        return res;


    }
}