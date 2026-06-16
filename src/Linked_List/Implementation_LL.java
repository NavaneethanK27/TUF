package Linked_List;
class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class MyLinkedList {
    Node head = null;
    Node temp = null;

    void creation(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }

        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_node;
    }

    void display(Node head) {
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void insert_At_front(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    void insert_At_end(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }

        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_node;
    }

    void deletion_at_head() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    void deletion_at_last() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    int length(Node head) {
        if (head == null) {
            return 0;
        }

        return 1 + length(head.next);
    }

    boolean search_in_ll(Node head, int target) {
        temp = head;

        while (temp != null) {
            if (temp.data == target) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    Node reverse(Node head) {
        Node prev = null;
        Node temp = head;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    boolean palindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node firsthalf = head;
        Node mid = middle(head);
        Node secondhalf = reverse(mid.next);

        while (secondhalf != null) {
            if (firsthalf.data != secondhalf.data) {
                return false;
            }

            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }

        return true;
    }

    public Node reverse_k_times(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        int count = 0;
        temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        count = 0;
        Node curr = head;
        Node prev = null;
        Node front = null;

        while (curr != null && count < k) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
            count++;
        }

        head.next = reverse_k_times(curr, k);
        return prev;
    }

    public Node separate(Node head) {
        if (head == null) {
            return null;
        }

        Node odd = head;
        Node even = head.next;
        Node evenhead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }

    public Node rotate_list_k_times(Node head, int k) {
        int n = length(head);

        if (head == null || n == 0 || k == 0) {
            return head;
        }

        k = k % n;

        if (k == 0) {
            return head;
        }

        int klen = n - k;
        temp = head;

        for (int i = 1; i < klen; i++) {
            temp = temp.next;
        }

        Node newhead = temp.next;
        temp.next = null;

        Node last = newhead;
        while (last.next != null) {
            last = last.next;
        }

        last.next = head;
        return newhead;
    }

    public Node add(Node l1, Node l2) {
        Node dummy = new Node(0);
        temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            Node new_node1 = new Node(sum % 10);
            temp.next = new_node1;
            temp = temp.next;
        }

        return dummy.next;
    }

    public Node zero_s_one_s_two_s(Node head){
        Node zero = new Node(-1);
        Node one = new Node(-1);
        Node two = new Node(-1);

        Node zero_trail=zero;
        Node one_trail=one;
        Node two_trail=two;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero_trail.next=temp;
                zero_trail=temp;
            }else if(temp.data==1){
                one_trail.next=temp;
                one_trail=temp;
            }else{
                two_trail.next=temp;
                two_trail=temp;
            }
            temp=temp.next;
        }
        zero_trail.next=one.next;
        one_trail.next=two.next;
        two_trail.next=null;
        return zero.next;

    }
}

public class Implementation_LL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        MyLinkedList ll = new MyLinkedList();

        for (int j : arr) {
            ll.creation(j);
        }

        ll.display(ll.head);

        ll.insert_At_front(0);
        System.out.println();
        ll.display(ll.head);

        ll.insert_At_end(6);
        System.out.println();
        ll.display(ll.head);

        ll.deletion_at_head();
        System.out.println();
        ll.display(ll.head);

        ll.deletion_at_last();
        System.out.println();
        ll.display(ll.head);

        System.out.println();
        System.out.println(ll.length(ll.head));

        System.out.println();
        System.out.println(ll.search_in_ll(ll.head, 3));

        System.out.println();
        Node mid = ll.middle(ll.head);
        ll.display(mid);

        System.out.println();
        Node reverse = ll.reverse(ll.head);
        ll.display(reverse);

        int[] pal = {1, 2, 2, 1};

        MyLinkedList ll2 = new MyLinkedList();

        for (int j : pal) {
            ll2.creation(j);
        }

        System.out.println();
        ll2.display(ll2.head);
        System.out.println();
        System.out.println(ll.palindrome(ll2.head));


        int[] reverse_k = {1, 2, 3, 4, 5, 6};

        MyLinkedList ll3 = new MyLinkedList();

        for (int j : reverse_k) {
            ll3.creation(j);
        }

        Node reversed = ll3.reverse_k_times(ll3.head, 2);
        ll3.display(reversed);

        int[] even_odd = {1, 2, 3, 4, 5, 6};

        MyLinkedList ll4 = new MyLinkedList();

        for (int j : even_odd) {
            ll4.creation(j);
        }

        System.out.println();
        Node odd = ll4.separate(ll4.head);
        ll4.display(odd);

        int[] rotate = {1, 2, 3, 4, 5};

        MyLinkedList ll5 = new MyLinkedList();

        for (int j : rotate) {
            ll5.creation(j);
        }

        System.out.println();
        Node temp1 = ll5.rotate_list_k_times(ll5.head, 2);
        System.out.println("Rotate by k times: ");
        ll5.display(temp1);

        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};

        MyLinkedList lll1 = new MyLinkedList();

        for (int j : l1) {
            lll1.creation(j);
        }

        MyLinkedList lll2 = new MyLinkedList();

        for (int j : l2) {
            lll2.creation(j);
        }

        Node sum = lll1.add(lll1.head, lll2.head);
        System.out.println();
        System.out.println("sum of two linked list: ");
        lll1.display(sum);

        int[] nums = {0,1,1,2,0,1};
        MyLinkedList lll3 = new MyLinkedList();
        for(int j:nums){
            lll3.creation(j);
        }

        Node result = lll3.zero_s_one_s_two_s(lll3.head);
        System.out.println();
        System.out.println("sort by 0's 1's 2's: ");
        lll3.display(result);
    }
}
