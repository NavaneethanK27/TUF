package queue;
class ListNode1 {
    int data;
    ListNode1 next;

    ListNode1(int data) {
        this.data = data;
        this.next = null;
    }
}
class ll{
    ListNode1 start=null;
    ListNode1 end=null;
    ListNode1 temp;
    void enqueue(int data){
        ListNode1 new_node= new ListNode1(data);
        if(start==null){
            start=new_node;
            end=new_node;
            return;
        }
        end.next=new_node;
        end=new_node;
    }

    void dequeue(){
        if(start==null){
            System.out.println("empty");
            return;
        }
        start=start.next;
        
        if(start==null) {
            start=null;
            end=null;
        }

    }


    void display(){
        if(start==null) {
            System.out.println("empty");
            return;
        }
        temp=start;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println("null");
    }
}
public class implementQueueusinglinkedlist {

    public static void main(String[] args){
        ll q=new ll();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
    }
}

