package selfgfg.array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        Stack<Long> st=new Stack<>();
        long[] v=new long[n];
        int j=0;

        st.push(arr[n-1]);
        v[j++]=-1;

        for(int i=arr.length-2 ; i>=0 ; i--){

            while(!st.isEmpty() && arr[i]>=st.peek())
                st.pop();

            long nextElement= st.empty() ? -1 : st.peek() ;
            v[j++]=nextElement;

            st.push(arr[i]);
        }
        reverseArray(v,0,n-1);
        return v;
    }
    static void reverseArray(long[] arr, int s, int e){
        while (s<=e){
            long temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
       long arr[] = {1 ,3, 2 ,4};
       nextLargerElement(arr,4);
    }
}
