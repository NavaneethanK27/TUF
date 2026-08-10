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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer>result  = new ArrayList<>();
        ListNode temp = head;
        int sum = 0;
        while(temp!=null){
            if(temp.val==0 && sum!=0){
                result.add(sum);
                sum = 0;
            }else{
                sum+=temp.val;
            }
            temp = temp.next;
        }
        System.out.println(result);
        ListNode dummy = new ListNode(0);
        temp = dummy;
        for(int i:result){
           ListNode new_node  = new ListNode(i);
           temp.next = new_node;
           temp = temp.next;
        }
        return dummy.next;
    }
}