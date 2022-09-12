package selfgfg.stack;

import java.util.Stack;

public class RemoveConsecutiveDuplicate {
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0 ; i< str.length() ; i++){
            if(!st.isEmpty() && st.peek()==str.charAt(i)){
                st.pop();
            }
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }

        return new StringBuilder(res).reverse().toString();
    }
    public static void main(String[] args) {
        String str="abbccbcd";
        System.out.println("Remove Pair Output: "+removeConsecutiveDuplicates(str));
    }
}
