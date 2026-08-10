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
        ListNode dummy = new ListNode(0);
        ListNode dummy_temp = dummy;
        ListNode temp = head;
        int sum = 0;
        while(temp!=null){
            if(temp.val==0 && sum!=0){
                ListNode new_node  = new ListNode(sum);
                dummy_temp.next = new_node;
                dummy_temp = dummy_temp.next;
                sum = 0;
            }else{
                sum+=temp.val;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}