package Stack;

public class Implementation_stack_using_Array {
    int top;
    int[] stack;
    int size;
    Implementation_stack_using_Array(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }
    void push(int data){
        if(top==size-1){
            System.out.println("stack is overFlow");
        }
        else{
            stack[++top]=data;
        }
    }
    int  pop(){
        if(top==-1){
            throw new RuntimeException("Stack UnderFlow");
        }
        else {
            return stack[top--];
        }
    }
    void display(){
       for(int i=top;i>=0;i--){
           System.out.print(stack[i]+" ");
       }
    }
    boolean isempty(){
        return top==-1;
    }
    public static void main(String[] args){
        int size=5;
        Implementation_stack_using_Array st=new Implementation_stack_using_Array(size);
        st.push(7);
        st.push(8);
        st.push(9);
        int digit =st.pop();
        System.out.println("Poped element: "+digit);
        st.display();
    }
}
