package Linked_List;

import java.util.ArrayList;
import java.util.Collections;

class  Nodes{
    int data;
    Nodes next;
    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Nodes head;
    Nodes temp;
    void creation(int data){
        Nodes new_nodes=new Nodes(data);
        if(head==null){
            head=new_nodes;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_nodes;
    }
    void display(Nodes head){
        Nodes temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }System.out.println();
    }
    void bruteforce_sort(Nodes head){
        Nodes temp=head;
        ArrayList<Integer>list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static Nodes middle(Nodes head) {
        Nodes slow = head;
        Nodes fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Nodes mergesort(Nodes head){
        if(head==null || head.next==null){
            return head;
        }

        Nodes middle = middle(head);

        // Split into two halves
        Nodes right = middle.next;
        middle.next = null;
        Nodes left = head;

        left=mergesort(left);
        right=mergesort(right);

        return merge_two_list(left,right);
    }
    public Nodes merge_two_list(Nodes head1,Nodes head2){
        Nodes t1=head1;
        Nodes t2=head2;
        Nodes dummy = new Nodes(-1);
        Nodes temp=dummy;
        while(t1!=null &&  t2!=null){
            if(t1.data <= t2.data){
                temp.next=t1;
                t1=t1.next;
            }else{
                temp.next=t2;
                t2=t2.next;
            }
            temp=temp.next;
        }
        if(t1!=null){
            temp.next=t1;
        }else{
            temp.next=t2;
        }
        return dummy.next;
    }
}
public class sortlinkedlist {
    public static void main(String[] args){
        int[] arr1 = {2,4,8,10};
        Linkedlist ll1 = new Linkedlist();
        for(int i:arr1){
            ll1.creation(i);
        }
        ll1.display(ll1.head);
        ll1.bruteforce_sort(ll1.head);
        int[] arr2 = {1,3,3,6,11,4,5};
        Linkedlist ll2 = new Linkedlist();
        for(int i:arr2){
            ll2.creation(i);
        }
        ll2.display(ll2.head);
        Nodes sort=ll2.mergesort(ll2.head);
        ll2.display(sort);

     }
}
