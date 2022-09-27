package selfgfg.string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsRotatedString {

    public static boolean areRotations(String s1, String s2 )
    {
        if (s1.length() != s2.length())
            return false;

        Stack<Character> q1 = new Stack<>();
        for (int i = 0; i < s1.length(); i++) {
            q1.add(s1.charAt(i));
        }

        Queue<Character> q2 = new LinkedList<>();
        for (int i = 0; i < s2.length(); i++) {
            q2.add(s2.charAt(i));
        }

        int k = s2.length();
        while (k > 0) {
            k--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if (q2.equals(q1))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";


        // Function call
        if (areRotations(str1, str2))
            System.out.println(
                    "Strings are rotations of each other");
        else
            System.out.printf(
                    "Strings are not rotations of each other");
    }
}
