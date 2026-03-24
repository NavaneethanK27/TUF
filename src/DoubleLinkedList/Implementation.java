package DoubleLinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
       this.data=data;
       this.next=this.prev=null;
    }
}
class dll{
    Node head=null;
    Node temp=null;
    void creation(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            head.prev=null;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
    }
    void display(Node head){
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println();
    }
    void displaybackward(Node head){
        temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }System.out.println("");
    }
    void insertAtend(int data){
        Node new_Node = new Node(data);
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_Node;
        new_Node.prev=temp;
    }
    void insertAtbeg(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head.prev=new_node;
        head=new_node;
    }
    void deletionAtend(){
        temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }

}
public class Implementation {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    dll obj1=new dll();
    int size=sc.nextInt();
    for(int i=0;i<size;i++){
        int data=sc.nextInt();
        obj1.creation(data);
    }
     obj1.display(obj1.head);
     obj1.displaybackward(obj1.head);
     obj1.insertAtend(9);
     obj1.display(obj1.head);
     obj1.insertAtbeg(10);
     obj1.display(obj1.head);
     obj1.deletionAtend();
     obj1.display(obj1.head);
    }
}
