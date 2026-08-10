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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        System.out.print(set);
        ListNode dummy = new ListNode(0);
        ListNode dummy_temp = dummy;
        ListNode temp = head;
       
        while(temp!=null){
            if(!set.contains(temp.val)){
                dummy_temp.next = temp;
                dummy_temp = dummy_temp.next;
            }
            temp = temp.next;
        }
        dummy_temp.next =null;
        return dummy.next;
    }
}