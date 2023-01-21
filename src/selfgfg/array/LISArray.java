package selfgfg.array;

public class LISArray {

    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int arr[])
    {
        // code here
        int lis[]=new int[size];
        for(int i=0; i<size ; i++)
            lis[i]=1;

        for(int i=0; i<size ; i++){
            int x=arr[i];
            for (int j=i ; j<size ; j++){
                if (x<arr[j]){
                     x=arr[j];
                     lis[i]=lis[i]+1;
                }
            }
        }
        int res=0;
        for(int i =0; i< size; i++){
             if (lis[i]>res)
                 res=lis[i];
        }
        return res;
    }

    public static void main(String[] args) {
       int A[]={0,8,4,12,2,10,6,14,1,9,5 ,13,3,11,7,15};
        System.out.println(longestSubsequence(16,A));
    }
}
