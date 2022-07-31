package selfgfg.string;

public class SubSequenceRecursion {

   static boolean subSequence(String s1, String s2 , int n, int m){
       if (m==0)
           return true;
       if (n==0)
           return false;

       if (s1.charAt(n-1)==s2.charAt(m-1)){
           return subSequence(s1,s2,n-1, m-1);
       }else {
          return subSequence(s1,s2, n-1 , m);
       }

       //return false;
   }

    public static void main(String[] args) {
        String str1= "ABCDEF";
        String str2=  "ABD";

        System.out.println("Sub Sequence is : "+subSequence(str1,str2,str1.length() , str2.length()));

    }

}
