package selfgfg.string;

public class PatternSearching {

    static void findIndexFirstAndLast(String s, String p){

        int strLength=s.length();
        int patternLength=p.length();

        for (int i=0 ; i<=strLength -patternLength  ; i++){
            int j;
            for (j=0 ; j< patternLength ; j++){
                if (s.charAt(i+j)!=p.charAt(j))
                       break;
            }
            if (j==patternLength)
                System.out.println("Start and end index is at : "+ i +" "+(i+patternLength));

        }
    }

    public static void main(String[] args) {
       String  s= "aabaacaadaabaaabaa";
       String  p= "aaba";

       findIndexFirstAndLast(s,p);
    }
}
/*
*
* Given a string S and a pattern P both of lowercase characters.
*  The task is to check if the given pattern exists in the given string or not.
Example 1:
Input:
S = aabaacaadaabaaabaa
P = aaba
Output: Yes
Explanation: Given pattern aaba is found
in the string at index 0.
Example 2:
Input:
S = aabaacaadaabaaabaa
P = ccda
Output: No
Explanation: Given pattern ccda doesn't
exists in the string at all.
Your Task:
The task is to complete the function search() which finds the pattern in the given string.
* The function takes pattern and string as parameters and returns either true or false.
* Return true if pattern exists else return false.
Expected Time Complexity: O(N*M).
Expected Auxiliary Space: O(1).
Note: N = |S|, M = |P|.

Constraints:
1 <= |S|, |P| <= 103
* */