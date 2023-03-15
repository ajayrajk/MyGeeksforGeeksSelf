package selfgfg.linkedlist;

public class InsertAtEnd {

    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node node=new Node(data);
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node.next=slow.next;
        slow.next=node;

        return head;
    }

    public static void main(String[] args) {

    }
}
