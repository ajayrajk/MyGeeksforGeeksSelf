package selfgfg.string;

import java.util.Arrays;

public class NonRepeatingChar {

    static int CHAR=256;

    /*
    * Efficient  Approach return index
    * */
    static int findNonRepeating(String str){
        int [] count=new int [CHAR];
        Arrays.fill(count , -1);
        for (int i=0; i< str.length() ; i++){
               if (count[str.charAt(i)]==-1)
                   count[str.charAt(i)]=i;
               else count[str.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for (int i=0;i < CHAR ; i++)
            if (count[i]>=0){
                res=Math.min(res,count[i]);
            }
        return  (res==Integer.MAX_VALUE)?-1:res;
    }

    /*
    * Better Approach return index
    * */

    static int findNRepeating(String str){
        int index=-1;
        int [] countArray=new int[CHAR];
        for (int i=0 ; i< str.length() ; i++){
            countArray[str.charAt(i)]++;
        }
        for (int i=0 ;i< str.length() ; i++){
            if (countArray[str.charAt(i)]==1)
            {
                index=i;
                break;
            }
        }
        return index;
    }

    static char nonRepeatingCharacter(String s)
    {
        int [] count=new int[CHAR];
        Arrays.fill(count,-1);

        //Your code here
        for(int i=0 ; i<s.length() ; i++){
            if(count[s.charAt(i)]==-1)
                count[s.charAt(i)]=i;
            else  count[s.charAt(i)]=-2;
        }

        for(int i=0 ; i< s.length() ; i++){
            if(count[s.charAt(i)]>=0){
                return s.charAt(i);
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(findNRepeating(str));
    }

}
