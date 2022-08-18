package selfgfg.stack;

import java.util.Stack;

public class StockSpanEfficientSolution {

    public static void printSpan(int arr[],int n){

        Stack<Integer> s=new Stack<>() ;
        //add index 0
        s.add(0);
        // print first item span
        System.out.print(1+" ");

        for(int i=1;i<n;i++){

            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                  s.pop();
            }
            int span=s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    public static void main (String[] args) {

        int[] arr=new int[]{18,12,13,14,11,16};

        printSpan(arr,arr.length);

        calculateSpan(arr,arr.length);

    }

    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here

        Stack<Integer> st=new Stack<Integer>();
        int [] spanArray=new int[n];
        //push like 0 index now in stack
        st.push(0);

        spanArray[0]=1;
        for(int i = 1; i< n ;i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            int span =st.isEmpty() ? i+1 : (i-st.peek()) ;
            spanArray[i]=span;
            st.push(i);
        }
        return spanArray;
    }
}
