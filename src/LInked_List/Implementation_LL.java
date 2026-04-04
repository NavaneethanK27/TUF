package LInked_List;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    Node temp=null;
    void creation(int data){
        Node new_node =  new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    void display(Node head){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void insert_At_front(int data){
        Node new_node = new Node(data);
        new_node.next=head;
        head=new_node;
    }
    void insert_At_end(int data){
        Node new_node = new Node(data);
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }

    void deletion_at_head(){
        temp = head;
        head=head.next;
        temp.next=null;
        temp=head;
    }

    void deletion_at_last(){
        temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    int  length(Node head){
        int count=0;
        if(head==null){
            return 0;
        }
        return 1+length(head.next);
    }

    boolean serach_in_ll(Node head,int target){
        temp=head;
        while(temp!=null){
            if(temp.data==target){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    Node Reverse(Node head){
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    boolean palindrome(Node head){
        Node firsthalf=head;
        Node mid = middle(temp);
        Node Secondhalf=Reverse(mid);
        while(Secondhalf!=null){
            if(firsthalf.data!=Secondhalf.data){
                return false;
            }
            firsthalf=firsthalf.next;
            Secondhalf=Secondhalf.next;
        }
        return false;
    }
}
public class Implementation_LL {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        LinkedList ll = new LinkedList();
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
        System.out.println(ll.serach_in_ll(ll.head,3));

        System.out.println();
        Node mid = ll.middle(ll.head);
        ll.display(mid);

        System.out.println();
        Node reverse = ll.Reverse(ll.head);
        ll.display(reverse);

        int[] pal = {1,2,2,1};
        LinkedList ll2 = new LinkedList();
        for (int j : pal) {
            ll2.creation(j);
        }
        System.out.println();
        ll2.display(ll2.head);
        System.out.println();
        System.out.println(ll.palindrome(ll2.head));
    }
}
