//package LInked_List;
//
//import java.util.Scanner;
//
//class node{
//    int data;
//    node next;
//    node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class List{
//    node head=null;
//    node temp=null;
//    void creation(int data){
//        node new_node=new node(data);
//        temp=head;
//        if(head==null){
//            head=new_node;
//            return;
//        }
//        temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=new_node;
//    }
//    void display(node head){
//        temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+"=>");
//            temp=temp.next;
//        }
//        System.out.print("null");
//    }
//    void commonelement(node head1,node head2){
//        node t1=head1;
//       while(t1!=null){
//           node t2=head2;
//           while(t2!=null){
//               if(t1.data==t2.data){
//                   System.out.print(t1.data+" ");
//                   break;
//               }
//
//               t2=t2.next;
//           }
//           t1=t1.next;
//       }
//    }
//    void
//}
//public class common_elements{
//    public static void main(String[] args) {
//        List l1=new List();
//        int n=5;
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<n;i++){
//            int data=sc.nextInt();
//            l1.creation(data);
//        }
//        l1.display(l1.head);
////        System.out.println("..........");
//        List l2=new List();
//        int m=6;
//        for(int i=0;i<m;i++){
//            int data=sc.nextInt();
//            l2.creation(data);
//        }
//        l2.display(l2.head);
//        List l3=new List();
//        l3.commonelement(l1.head,l2.head);
//
//    }
//}