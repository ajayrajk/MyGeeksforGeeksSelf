package selfgfg.stack;

import java.util.Stack;

public class PreviousGreaterElement {


    /*
    * Naive Code
    * */
    static void printPrevGreater(int [] arr, int n){
        for (int i=0; i< n ; i++){
            int j;
            for( j=i-1 ; j>=0 ; j--){
                if (arr[i]<arr[j]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if (j==-1)
                System.out.print(-1+" ");
        }
    }

    static void printPG(int [] arr, int n){
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        System.out.print(-1+" ");
        for (int i=1; i< n ; i++){
            while (!st.empty() && st.peek()<=arr[i]){
                st.pop();
            }
            int prevg=st.empty()? -1 : st.peek();
            System.out.print(prevg+" ");
            st.push(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr=new int[]{20,30,10,5,15};
        printPrevGreater(arr,arr.length);
        System.out.println("\n Efficient Solution");
        printPG(arr,arr.length);
    }
}
