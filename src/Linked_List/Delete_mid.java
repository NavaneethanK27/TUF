class Node1 {
    // Data stored in the node
    int data;

    // Pointer to the next node
    Node1 next;

    // Constructor with data and next pointer
    Node1(int data1, Node1 next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node1(int data1) {
        data = data1;
        next = null;
    }
}

// Solution class contains method to delete middle node
class Solution {
    // Function to delete the middle node
    public Node1 deleteMiddle(Node1 head) {
        // If list has only one node, delete it
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow pointer to head
        Node1 slow = head;

        // Initialize fast pointer two steps ahead
        Node1 fast = head.next.next;

        // Traverse until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Bypass the middle node
        slow.next = slow.next.next;

        // Return head of updated list
        return head;
    }
}

// Main class for driver code
public class Delete_mid{

    public static void printLL(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating linked list 1->2->3->4->5
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);

        // Printing original list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting middle node
        Solution obj = new Solution();
        head = obj.deleteMiddle(head);

        // Printing updated list
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}