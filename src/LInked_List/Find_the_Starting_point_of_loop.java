package LInked_List;
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Find_the_Starting_point_of_loop {
    public int count(ListNode meetingpoint){
        ListNode temp=meetingpoint;
        int length=0;
        while (temp.next!=meetingpoint){
            length++;
            temp=temp.next;
        }
        return length;
    }
    public int Length_loop(ListNode head){
        ListNode slow= head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return count(slow);
            }
        }
       return 0;
    }
    public ListNode find_loop(ListNode head){
        ListNode slow= head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        Find_the_Starting_point_of_loop obj = new Find_the_Starting_point_of_loop();
        ListNode result = obj.find_loop(head);


        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.val);
        else
            System.out.println("No cycle found.");

        System.out.println(obj.Length_loop(head));
    }
}
