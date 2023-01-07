package selfgfg.bitSetMagic;

public class CountSetBit {

   static int countSetBit(int n){
        int res=0;
        while(n>0){
            if (n%2==1)
              res++;
            n=n/2;
        }
        return res;

    }

    /*
    * Brian
    * Kerningam's Algorithms
    * */

    static int countBitSetAlgo(int n){
        int res=0;
        while(n>0){
            // 1st Solution
            /*res=res+(n&1);
            n=n/2;*/

            // 2nd Solution
            n &= (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Count Bit Set " + countSetBit(8));
        System.out.println("Count Bit Set " + countBitSetAlgo(8));

    }
}
