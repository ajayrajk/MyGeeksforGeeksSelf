package selfgfg.array;

import java.util.Arrays;

public class RearrangeArray {

    static void arrange(long arr[], int n)
    {
        // your code here
        long [] temp=arr.clone();
        for(int i= 0 ; i< n ; i++){
            arr[i]=temp[(int)temp[i]];
        }
    }

    public static void main(String[] args) {
       long arr[] = {4,0,2,1,3};
       arrange(arr,5);
       System.out.println(Arrays.toString(arr));
    }
}
