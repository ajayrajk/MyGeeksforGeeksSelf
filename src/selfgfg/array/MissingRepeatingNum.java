package selfgfg.array;

import java.util.Arrays;

public class MissingRepeatingNum {
   static int[] findTwoElement(int arr[], int n) {
        // code here
        int res[] =new int[2];
        int count[]=new int[n+1];

        for (int i=0 ; i< arr.length ; i++){
            count[arr[i]]++;
        }

        for (int i=1 ; i< count.length ; i++){
            if (count[i]>1)
                res[0]=i;
            if (count[i]==0)
                res[1]=i;
        }

        return res;

    }

    public static void main(String[] args) {
            // int arr[]={2,2};
        int  arr[] = {1, 3, 3};

        System.out.println(Arrays.toString(findTwoElement(arr, 3)));
    }
}
