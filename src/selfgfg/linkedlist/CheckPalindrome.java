package selfgfg.linkedlist;

import java.util.Stack;

import static selfgfg.linkedlist.LinkedListOperation.insertAtBegin;

public class CheckPalindrome {
    static boolean isPalindrome(Node head)
    {
        //Your code here
        Stack<Integer> st=new Stack<Integer>();
        for(Node curr=head ; curr!=null ; curr=curr.next){
            st.push(curr.data);
        }
        for(Node curr=head ; curr!=null ; curr=curr.next){
            if(st.pop()!=curr.data)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head=null;
        head= insertAtBegin(head, 1);
        head= insertAtBegin(head, 2);
        head= insertAtBegin(head, 3);
        head= insertAtBegin(head, 2);
        head= insertAtBegin(head, 1);

        System.out.println("Is Palindrome : "+ isPalindrome(head));
    }
}
