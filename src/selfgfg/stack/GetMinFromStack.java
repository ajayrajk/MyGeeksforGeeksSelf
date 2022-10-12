package selfgfg.stack;

import java.util.Stack;

public class GetMinFromStack {
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[], int n)
    {
        // your code here
        Stack<Integer> st=new Stack<Integer>();
        int min=arr[0];
        for(int i=0 ; i<n ; i++)
        {
            min=Math.min(min,arr[i]);
            st.push(min);
        }
        return st;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s)
    {
        // your code here
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int [] A = {1 ,2, 3 ,4 ,5};
        _getMinAtPop(_push(A,N));
    }
}
