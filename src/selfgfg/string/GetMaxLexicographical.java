package selfgfg.string;

public class GetMaxLexicographical {

    static int CHAR=256;
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] frequency =new int[CHAR];
        char ch=' ';
        int maxCount=0;
        for(int i=0 ; i< line.length() ; i ++){
            frequency[line.charAt(i)]++;
            if(frequency[line.charAt(i)] > maxCount ||
                    (frequency[line.charAt(i)]== maxCount  && line.charAt(i)<ch)){
                   maxCount=frequency[line.charAt(i)] ;
                ch=line.charAt(i);
            }
        }
        return ch;
    }

    public static void main(String[] args) {
       String str = "testsample";

       System.out.println(getMaxOccuringChar(str));

    }
}
