package selfgfg.string;

import java.util.Arrays;

public class ReverseWordFromString {


    public static void main(String[] args) {
        String s = "Welcome to Gfg";
        char[] str = s.toCharArray();
        reverseString(str);
        System.out.println(str);
    }

    static void reverseString(char[] chars) {
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = i + 1;
            }
        }
        //last words reverse
        reverse(chars, start, chars.length - 1);
        //reverse string
        reverse(chars, 0, chars.length - 1);
    }


    static void reverse(char[] ch, int low, int high) {
        while (low < high) {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
    }
}
