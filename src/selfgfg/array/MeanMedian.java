package selfgfg.array;

import java.util.Arrays;

public class MeanMedian {

    //Function to find median of the array elements.
    public static int median(int A[],int N)
    {
        Arrays.sort(A);
        int median=0;
        if(N%2!=0)
            median=A[N/2];
        else
            median=(A[N/2]+A[N/2-1])/2;
        return median;

    }
    //Function to find median of the array elements.
    public static int mean(int A[],int N)
    {
        //Your code here
        int sum=0;
        for(int i=0 ; i< N ; i++)
            sum+=A[i];
        return sum/N;
    }

    public static void main(String[] args) {
       int a [] = {2, 8, 3, 4};
       System.out.println("  Mean  "+ mean(a,3) + " Median " + median(a,3));
    }
}
