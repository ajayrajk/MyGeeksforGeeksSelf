package selfgfg.string;

public class BinarySubStringProblem {
    //Function to count the number of substrings that start and end with 1.
    /*
    * First solution
    * */
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        char [] chArray=str.toCharArray();
        int count=0;
        for(int i=0 ; i< a ; i++){
            //count all 1
            if(chArray[i]=='1')
                count++;
        }
        return (count*(count-1))/2;
    }

    public static int binarySubStringFind(int a, String str){
        int res=0;
        char [] charArray=str.toCharArray();
        for (int i=0 ; i < a ; i++){
            if (charArray[i]=='1'){
                for (int j=i+1 ; j < a ; j++){
                    if (charArray[j]=='1')
                        res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String string = "00100101";
        int n = string.length();
        System.out.println(binarySubStringFind(n,string));
    }
}

/*
* Given a binary string, count number of substrings that start and end with 1.
* For example, if the input string is “00100101”, then there are three substrings “1001”,
* “100101” and “101”.
*
* */
