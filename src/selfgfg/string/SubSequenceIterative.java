package selfgfg.string;

public class SubSequenceIterative {


    static boolean subSequence(String s1, String s2){

       /*
       * for code optimize the below line could be applied
       * */

        if (s1.length()<s2.length())
            return false;
        int j=0;
        for (int i=0 ; i< s1.length() && j< s2.length() ; i++){
            if (s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            if (j==s2.length())
                return true;
         }

        return false;
    }

    public static void main(String[] args) {
       String str1= "ABCDEF";
       String str2=  "ABD";

       System.out.println("Sub Sequence is : "+subSequence(str1,str2));

    }
}
