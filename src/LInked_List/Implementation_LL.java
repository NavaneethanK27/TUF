package LInked_List;
class Node{
    int data;
    Node next;
    Node(){}
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
        if(head == null){
            head = new_node;
            return;
        }

        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }

    void deletion_at_head(){
        if(head == null) return;
        head = head.next;
    }

    void deletion_at_last(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    int  length(Node head){
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
        Node mid = middle(head);
        Node Secondhalf = Reverse(mid.next);
        while(Secondhalf!=null){
            if(firsthalf.data!=Secondhalf.data){
                return false;
            }
            firsthalf=firsthalf.next;
            Secondhalf=Secondhalf.next;
        }
        return true;
    }

    public Node reverse_k_times(Node head,int k){
        int count=0;
        temp=head;
        if(head == null) return null;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count<k)return head;

        count=0;
        Node curr = head;
        Node prev=null;
        Node front = null;
        while (curr!=null && count<k){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
            count++;
        }
        head.next=reverse_k_times(curr,k);
        return prev;
    }

    public  Node separate(Node head){
        if(head==null) return head;
        Node odd = head;
        Node even=head.next;
        Node evenhead=even;
        while (even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }

    public Node rotate_list_k_times(Node head,int k){
        int n=length(head);
        if(k%n==0){return head;}
        k=k%n;
        int klen=n-k;
        System.out.println(n);
        temp=head;
        for(int i=1;i<klen-1;i++){
            temp=temp.next;
        }
        Node newhead = temp.next;
        temp.next=null;
        Node last=newhead;
        while (last.next!=null){
            last=last.next;
        }
        last.next=head;
        return newhead;
    }

    public Node add(Node l1,Node l2){
        Node dummy = new Node(0);
        temp=dummy;

        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;

            Node new_node1 = new Node(sum%10);
            temp.next=new_node1;
            temp=temp.next;
        }
    return dummy.next;
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


        int[] reverse_k={1,2,3,4,5,6};
        LinkedList ll3 = new LinkedList();
        for (int j :reverse_k) {
            ll3.creation(j);
        }
        Node reversed=ll3.reverse_k_times(ll3.head,2);
        ll3.display(reversed);



        int[] even_odd={1,2,3,4,5,6};
        LinkedList ll4 = new LinkedList();
        for (int j :even_odd) {
            ll4.creation(j);
        }
        System.out.println();
        Node odd = ll4.separate(ll4.head);
        ll4.display(odd);

        int[] rotate={1,2,3,4,5};
        LinkedList ll5 = new LinkedList();
        for (int j :rotate) {
            ll5.creation(j);
        }
        System.out.println();
        Node temp1=ll5.rotate_list_k_times(ll5.head,2);
        ll5.display(temp1);


        int[] l1={2,4,3};
        int[] l2={5,6,4};

        LinkedList lll1=new LinkedList();
        for (int j :l1) {
            lll1.creation(j);
        }

        LinkedList lll2=new LinkedList();
        for (int j :l2) {
            lll2.creation(j);
        }

        //add
        Node sum= lll1.add(lll1.head,lll2.head);
        System.out.println();
        lll1.display(sum);
    }
}
