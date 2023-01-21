package selfgfg.linkedlist;

import java.util.Stack;

public class NthFromEndNode {

    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        // Your code here
        Stack<Integer> st=new Stack<>();

        while(head!=null){
            st.push(head.data);
            head=head.next;
        }
        int j=1;
        if(st.size()>=n){
            while(n>j){
                if(!st.isEmpty()){
                    st.pop();
                    j++;
                }
            }
            return st.pop();
        }
        return -1;
    }
    public static void main(String[] args) {
         System.out.println();
    }
}
