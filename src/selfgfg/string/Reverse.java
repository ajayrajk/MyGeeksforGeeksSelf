package selfgfg.string;

import java.util.Arrays;

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        /*char [] charArray =str.toCharArray();
        int j=charArray.length-1;
        String strReverse="";
        for (int i=j ; i >=0 ; i-- ){
            *//*char temp=charArray[i];
            charArray[i] = charArray[j];
            charArray[j]= temp;*//*
            strReverse+=charArray[i];
        }*/
        // Reverse the string str
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }

        return reverse;

    }

    public static void main(String[] args) {
        System.out.println(reverseWord("AJAYRAJPUT"));
    }
}
