package selfgfg.string;

public class LeftMostRepeatedChar {


    static int CHAR=256;
    static int leftMost(String str){
        boolean [] visitedArray = new boolean[CHAR];
        int res=-1;
        for (int i=str.length()-1 ; i >= 0 ; i--){
            if (visitedArray[str.charAt(i)]){
                res =i;
            }else
                visitedArray[str.charAt(i)]=true;
        }
       return res;
    }

    public static void main(String[] args) {
        System.out.println("");
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}
