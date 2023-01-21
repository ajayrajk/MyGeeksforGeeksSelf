package selfgfg.string;

public class DigitSum {

    public static int superDigit(String n, int k) {
        // Write your code here
        StringBuilder resultSum= new StringBuilder();
        for(int i=0; i< k ; i++)
            resultSum.append(n);

        int nSum=Integer.parseInt(resultSum.toString());
        int sum=0;
        while (nSum > 0 || sum > 9)
        {
            if (nSum == 0) {
                nSum = sum;
                sum = 0;
            }
            sum += nSum % 10;
            nSum /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(superDigit("123",3));
    }
}
