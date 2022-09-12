package selfgfg.stack;

import java.util.Stack;

public class RemovePair {

    public static String removePair(String str)
    {
        // your code here
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0 ; i<str.length() ; i++ ){
            if(st.isEmpty() || st.peek()!=str.charAt(i)){
                st.push(str.charAt(i));
            }else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }

        return new StringBuilder(res).reverse().toString();
    }

    public static void main(String[] args) {
        String str="aaabbaaccd";
        System.out.println("Remove Pair Output: "+removePair(str));
    }
}
