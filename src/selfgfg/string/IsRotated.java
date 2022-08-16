package selfgfg.string;

public class IsRotated {

    public static boolean areRotations(String str1, String str2)
    {
        // Your code here
        if(str1.length()!=str2.length())
            return false ;
        return (str1 + str2).contains(str2);
    }

    public static void main(String[] args) {
        //String s1 = "ABCD";String s2="CDAB";
        String s1="wlrbbmqbhcdar";
       String s2="owkkyhiddqscd";
        if(areRotations(s1,s2)){System.out.println("Strings are rotations of each other");}
        else {System.out.println("Strings are not rotations of each other");}

    }
}
