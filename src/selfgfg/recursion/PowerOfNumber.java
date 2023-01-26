package selfgfg.recursion;

public class PowerOfNumber {

  static long power(int N,int R)
    {
        //Your code here

        if(R==0)
            return 1;
        long ans=power(N,R/2);
        ans=(ans*ans)%1000000007;
        if(R%2==0)
            return ans;

        return (ans*N)%1000000007;
    }


    public static void main(String[] args) {
        System.out.println(power(2,2));
    }
}
