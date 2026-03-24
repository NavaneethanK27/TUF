//package LInked_List;
//import java.util.*;
//class Node1{
//    int data;
//    Node1 next1=null;
//    Node1(int data){
//        this.data=data;
//        this.next1=null;
//    }
//}
//class List{
//     Node1 head=null;
//     Node1 temp=null;
//    void creation(int data){
//        Node1 new_node1=new Node1(data);
//        if(head==null){
//            head=new_node1;
//            return;
//        }
//        temp=head;
//        while(temp.next1!=null){
//            temp=temp.next1;
//        }
//        temp.next1=new_node1;
//    }
//    void display(Node1 head){
//        temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+"=>");
//            temp=temp.next1;
//        }
//        System.out.print("null");
//    }
//    Node1 reverse(Node1 head){
//        Node1 prev=null;
//        temp=head;
//        while(temp!=null){
//            Node1 front=temp.next1;
//            temp.next1=prev;
//            prev=temp;
//            temp=front;
//        }
//        return prev;
//    }
//    boolean checktrueorfalse(Node1 n1,Node1 n2){
//                 while(n1!=null && n2!=null){
//                     if(n1.data!=n2.data){
//                         return false;
//                     }
//                     n1=n1.next1;
//                     n2=n2.next1;
//                 }
//                 return true;
//    }
//    boolean optimal(Node1 head){
//       Node1 fast=head;
//       Node1 slow=head;
//       while(fast!=null && fast.next1!=null){
//           slow=slow.next1;
//           fast=fast.next1.next1;
//       }
//       Node1 mid=slow;
//       Node1 halfhead=reverse(slow.next1);
//       slow.next1=null;
//       boolean issame=checktrueorfalse(head,halfhead);
//       halfhead=reverse(halfhead);
//       slow.next1=halfhead;
//       return issame;
//    }
//    Boolean check_palindrome(Node1 head){
//        temp=head;
//        Stack<Integer>st=new Stack<>();
//        while(temp!=null){
//            st.push(temp.data);
//            temp=temp.next1;
//        }
//        Node1 current=head;
//        while(current!=null){
//            int d=st.pop();
//            if(current.data!=d){
//                return false;
//            }
//            current=current.next1;
//        }
//        return true;
//    }
//}
//public class palinrome {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of nodes: ");
//        int n=sc.nextInt();
//        List l1=new List();
//        for(int i=0;i<n;i++) {
//            System.out.println("Enter the node: "+(i+1)+": ");
//            int data=sc.nextInt();
//            l1.creation(data);
//        }
//        l1.display(List.head);
//        System.out.println("\nAfter reverse :");
//        List.head=l1.reverse(List.head);
//        l1.display(List.head);
//        System.out.println();
//        System.out.println("\nCheck Using stack:");
//        boolean palindrome= l1.check_palindrome(List.head);
//        System.out.println(palindrome);
//        System.out.println("\ncheck using slow and fast Optimal:");
//        boolean palindromeopt=l1.optimal(List.head);
//        System.out.print(palindromeopt);
//    }
//}
