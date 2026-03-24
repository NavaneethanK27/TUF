//package LInked_List;
//
//import javax.management.StandardEmitterMBean;
//
//class Node2{
//    int data;
//    Node2 next;
//    Node2(int data){
//       this.data=data;
//       this.next=null;
//    }
//}
//class Nodelist{
//    static Node2 head=null;
//    static Node2 curr=null;
//    void creation(int data){
//        Node2 n_node=new Node2(data);
//        if(head==null){
//            head=n_node;
//            return;
//        }
//        curr=head;
//        while(curr.next!=null){
//            curr=curr.next;
//        }
//        curr.next=n_node;
//    }
//    void display(Node2 head){
//        curr=head;
//        while(curr!=null){
//            System.out.print(curr.data+"=>");
//            curr=curr.next;
//        }
//        System.out.println("null");
//    }
//    static Node2 reverse(Node2 head,int k) {
//        curr = head;
//        Node2 prev = null;
//        while (curr != null) {
//            Node2 front = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = front;
//        }
//        return prev;
//    }
//    static int len(Node2 head){
//       if(head==null){
//           return 0;
//       }
//       return 1+len(head.next);
//    }
//    static Node2 k_reverse(Node2 head,int k){
//        Node2 temp=head;
//        Node2 prev=null;
//        int count=0;
//        Node2 front=null;
//        while(temp!=null && count<k){
//            front=temp.next;
//            temp.next=prev;
//            prev=temp;
//            temp=front;
//            count++;
//        }
//        if(temp!=null){
//            head.next = Nodelist.k_reverse(temp, 3);
//        }
//        return  prev;
//    }
//}
//public class reverse_List_base_on_k {
//    public static void main(String[] args){
//       Nodelist l=new Nodelist();
//       l.creation(10);
//       l.creation(20);
//       l.creation(30);
//       l.creation(40);
//       l.creation(50);
//       l.creation(60);
//       l.display(Nodelist.head);
////       Nodelist.head=l.reverse(Nodelist.head);
//       l.display(Nodelist.head);
//       int k=3;
//        int legth=Nodelist.len(Nodelist.head);
//       l.head=l.k_reverse(l.head,3);
//       l.display(Nodelist.head);
//
//
//    }
//}
