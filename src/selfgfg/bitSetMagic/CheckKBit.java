package selfgfg.bitSetMagic;

public class CheckKBit {

    // Function to check if Kth bit is set or not.

    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        if(n==0)
        {
            return false;
        }
        if((n&(1<<k))!= 0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int  N = 500, K = 3;
        System.out.println("Check Kth Bit set or Not : "+ checkKthBit(N,K));
    }
}
