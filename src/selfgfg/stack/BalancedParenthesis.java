package selfgfg.stack;

import java.util.Stack;

public class BalancedParenthesis{

   static boolean isMatching(char stTop, char strCurrent){
       return  (stTop=='(' && strCurrent==')') || (stTop=='{' && strCurrent=='}') || (stTop=='[' && strCurrent==']') ;
   }
    static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for (int i=0 ; i < str.length() ; i++){
            if (str.charAt(i)=='(' || str.charAt(i)=='{' ||str.charAt(i)=='[' )
                st.push(str.charAt(i));
            else {
                  if (st.isEmpty())
                    return false;
                  else if (!isMatching(st.peek() , str.charAt(i))){
                      return false;
                  }
                  else
                      st.pop();
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        String str = "{()}[]";

        if (isBalanced(str))
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");

    }
}
