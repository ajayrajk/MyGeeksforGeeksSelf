package selfgfg.string;

public class IsAnagram {


    static boolean isAnagram(String s1, String s2){

        int charCount []=new int[256];
        if (s1.length()!=s2.length())
            return false;

        for (int i=0; i<s1.length() ; i++){
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }

        for (int i=0 ; i < charCount.length ; i++){
            if (charCount[i]!=0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
      String s1="aabcbcac";
      String s2="abcabcaa";

      System.out.println("Is Anagram : "+ isAnagram(s1,s2));
    }
}
