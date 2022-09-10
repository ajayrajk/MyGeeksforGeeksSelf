package selfgfg.array;

public class SlidingWindowMaxSum {



    /*
    * Efficient Solution
    * */
    public static int maxSum(int [] arr, int n , int k ){
        int curr=0;
        for (int i=0; i<k ; i++)
            curr+=arr[i];

        int max=curr;
        for(int i=k; i<n ; i++)
        {
            curr+=arr[i]-arr[i-k];
            max= Math.max(max, curr);
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[] = {1, 8, 30, -5, 20, 7};
        int  n = 6;
        int k = 3;
        System.out.println(maxSum(arr, n, k));

    }
}
