//package LInked_List;
//
//import java.util.List;
//
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class List_implementation {
//
//    static Node head = null;
//    static Node temp = null;
//
//    void creation(int data) {
//        Node new_node = new Node(data);
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
//    void display(){
//        temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    void insertionAtbeg(int data){
//        Node new_node = new Node(data);
//        new_node.next = head;
//        head = new_node;
//    }
//
//    void insertionAtend(int data){
//        temp=head;
//        Node new_node=new Node(data);
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//       temp.next=new_node;
//    }
//
//    void inserionAtpos(int data,int pos){
//        temp=head;
//        Node prev=head;
//        Node new_node=new Node(data);
//        for(int i=1;i<pos && temp!=null;i++){
//            prev=temp;
//            temp=temp.next;
//        }
//        prev.next=new_node;
//        new_node.next=temp;
//    }
//
//    void insertionbyval(int posval,int data){
//        temp=head;
//        Node front=null;
//        while(temp!=null){
//            if(temp.data==posval) {
//                Node new_node = new Node(data);
//                new_node.next=temp.next;
//                temp.next=new_node;
//                temp=new_node;
//            }
//            temp=temp.next;
//        }
//    }
//
//    void deletionAtbeg(){
//        if(head==null){
//            System.out.print("No element in the linkedList");
//            return;
//        }
//        head=head.next;
//    }
//
//
//    void deletionAtend(){
////        temp=head;
////        Node prev=null;
////        while(temp.next!=null){
////            prev=temp;
////            temp=temp.next;
////        }
////        prev.next=null;
//        //another method
//        temp=head;
//        Node prev=null;
//        while(temp.next.next!=null){
//            temp=temp.next;
//        }
//        temp.next=null;
//    }
//
//    void deletionAtpos(int pos1){
//        temp=head;
//        Node prev=head;
//        for(int i=1;i<pos1;i++){
//            prev=temp;
//            temp=temp.next;
//        }
//      prev.next=temp.next;
//    }
//
//    void deletionbyval(int val){
//        temp=head;
//        Node prev=head;
//        if(head.data==val){
//            head=head.next;
//        }
//        else{
//            while(temp.data!=val){
//                prev=temp;
//                temp=temp.next;
//            }
//            prev.next=temp.next;
//        }
//    }
//
//    static int length(Node node){
////        temp=head;
////        int length=1;
////        while(temp.next!=null){
////            length++;
////            temp=temp.next;
////        }
////        return length;
//        temp=node;
//        if(temp==null){
//            return 0;
//        }
//        return 1+length(temp.next);
//    }
//
//
//}
//public class Linked_list {
//    public static void main(String[] args){
//        List_implementation ld=new List_implementation();
//        ld.creation(10);
//        ld.creation(20);
//        ld.creation(30);
//        System.out.println("Linked List");
//        ld.display();
//
////        ld.insertionAtbeg(5);
////        System.out.println("Insertion At beg");
////        ld.display();
////
////        ld.insertionAtend(40);
////        System.out.println("Insertion At end");
////        ld.display();
////
////        ld.deletionAtbeg();
////        System.out.println("Deletion At beg");
////        ld.display();
////
////        ld.deletionAtend();
////        System.out.println("Deletion At end");
////        ld.display();
////        System.out.println("Length of the linked list: "+List_implementation.length(List_implementation.head));
////
////        ld.inserionAtpos(25,2);
////        System.out.println("Insertion At pos");
////        ld.display();
//
////
////        ld.deletionAtpos(3);
////        System.out.println("Deletion At pos");
////        ld.display();
////
////        ld.deletionbyval(10);
////        System.out.println("Deletion At Val");
////        ld.display();
//
//        ld.insertionbyval(20,25);
//        System.out.println("Insertion At Val");
//        ld.display();
//    }
//}
