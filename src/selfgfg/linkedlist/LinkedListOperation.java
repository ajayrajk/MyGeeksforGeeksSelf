package selfgfg.linkedlist;

public class LinkedListOperation {

    static Node insertAtBegin(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }

     static Node insertAtEnd(Node head, int x){

        Node temp=new Node(x);

        if(head==null)
            return head;

        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        //temp.next=null;
        return head;
    }



    static Node deleteFirst(Node head){
        if (head==null)
            return null;

        return head.next;

    }

    static Node deleteEnd(Node head){
        if (head==null)
            return null;
        if (head.next==null)
             return null;

        Node curr=head;
        while (curr.next.next!=null)
            curr=curr.next;

       curr.next=null;

       return head;
    }

    public static void main(String[] args) {
        Node head=null;
        head=insertAtBegin(head, 1);
        head= insertAtBegin(head, 2);
        head= insertAtBegin(head, 3);
        head= insertAtBegin(head, 4);
        head= insertAtBegin(head, 5);
        System.out.println("Traverse for insert at Start");
        traverseLinkedList(head);

        head= insertAtEnd(head, 6);
        head= insertAtEnd(head, 7);
        head= insertAtEnd(head, 8);
        System.out.println("Traverse for insert at end");

        traverseLinkedList(head);


        head= deleteFirst(head);
        head= deleteFirst(head);
        System.out.println("Traverse for delete at first");

        traverseLinkedList(head);


        head= deleteEnd(head);
        head= deleteEnd(head);
        System.out.println("Traverse for delete at end");

        traverseLinkedList(head);


    }


    static void traverseLinkedList(Node head){
        while (head!=null){
             System.out.println("Node Data " + head.data);
            head=head.next;
        }
    }
}
