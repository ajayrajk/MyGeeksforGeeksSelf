package selfgfg.string;

import java.util.Stack;

public class ReverseWords {

    //Function to reverse words in a given string.
   static String reverseWords(String str)
    {
        // code here
        Stack<String> st = new Stack<>();
        String temp="";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='.')
            {
                st.push(temp);
                temp = "";
            }
            else
            {
                temp += str.charAt(i);
            }
        }
        st.push(temp);
        String ans = "";
        while(st.size()>0)
        {
            ans += st.pop();
            if(st.size()>=1)
                ans +=".";
        }
        return ans;
    }

    public static void main(String[] args) {
       String s = "i.like.this.program.very.much";
       System.out.println("String reverse is : "+reverseWords(s));

    }
}
