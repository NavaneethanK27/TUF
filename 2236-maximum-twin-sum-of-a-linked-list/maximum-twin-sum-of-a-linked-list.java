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
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

    public static int length(ListNode head){
        if(head==null){
            return 0;
        }

        return 1+length(head.next);
    }

    public int pairSum(ListNode head) {
       
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode middle = null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        middle = reverse(mid);
        int max = 0;
        while(middle!=null){
            max = Math.max(max,middle.val+temp.val);
            temp=temp.next;
            middle=middle.next;
        }

        return max;
    }
}