package selfgfg.string;

public class SortString {
    static String sort(String s)
    {
        // code here
        //take int array for 26 character
        int charCount[]=new int[26];
        String sortString="";
        for(int i=0 ; i< s.length() ;i++)
            charCount[s.charAt(i)-'a']++;  // count the character frequency
        // for all character till 26
        for(int i=0 ; i< 26 ; i++){
            // traverse till now character count and add to a sortString
            for(int j=0 ; j< charCount[i] ;j++ ){
                sortString+=(char)(i+'a');
            }
        }
        return sortString;
    }

    public static void main(String[] args) {
       String s = "edcab";
        System.out.println("Sorted String : "+ sort(s));
    }
}
