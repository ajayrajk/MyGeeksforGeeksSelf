package selfgfg.stack;

public class StackAsLinkedList {

    StackNode root;
    static class StackNode{
     int data;
     StackNode next;
       StackNode(int data){
        this.data=data;
       }
    }
    /*
    * Check isEmpty or not
    * */
    public boolean isEmpty(){
        return root == null;
    }

    public void push(int data){
        StackNode newNode=new StackNode(data);
        if (root==null)
            root=newNode;
        else{
            StackNode temp=root;
            root=newNode;
            newNode.next=temp;
        }
    }

    public int pop(){
        if (root==null){
            System.out.println("Stack is Empty : ");
            return -1;
        }
        else{
            int popped = Integer.MIN_VALUE;
            popped=root.data ;
            root=root.next ;
            return popped;
        }
    }

    public int peek(){
        int peekNode=-1;
        if (root==null){
            System.out.println("Stack is Empty : ");
        }
        else
             peekNode= root.data;

        return peekNode;
     }

    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

    }


}
