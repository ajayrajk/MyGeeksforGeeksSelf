package selfgfg.array;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {

    public static void main(String[] args) {
      int arr[] = {2, 1, 5, 4};

      arrayReverse(arr,0,arr.length-1);

      System.out.println(Arrays.toString(arr));

    }

    static void  arrayReverse(int arr[], int start, int end){
        if (start>end)
            return;

        //swap item
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        arrayReverse(arr,start+1, end-1);
    }
}
