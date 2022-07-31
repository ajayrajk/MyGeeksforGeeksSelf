package selfgfg.string;

public class Palindrome {

   static int isPalindrome(String s) {
        // code here
//        String reverseStr="";
//        for(int i=s.length()-1;i>=0;i--){
//            reverseStr+=s.charAt(i);
//        }
        char [] charArray=s.toCharArray();
        int j=charArray.length-1;
        int i=0;
        for (i= 0 ; i< j/2 ; i++ , j-- ){
            if (charArray[i]==charArray[j]){
                continue;
            }else {
                return 0;
            }
        }
        if(j>i)
            return 1;
        else return 0;
    }


    static boolean isPalindromeString(String s){
       int start=0;
       int end=s.length()-1;
       while (start<end){
           if (s.charAt(start)!=s.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true;
    }
    public static void main(String[] args) {

        System.out.println("Is Palindrome : "+ isPalindrome("MADAM"));

        System.out.println("Is Palindrome : "+ isPalindromeString("MADAMMADAMA"));

    }
}
