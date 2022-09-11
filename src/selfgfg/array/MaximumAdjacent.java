package selfgfg.array;

import java.util.ArrayList;

public class MaximumAdjacent {
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int sizeOfArray, int [] arr){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1 ; i< sizeOfArray ; i++){
            int max=Math.max(arr[i-1],arr[i]);
            list.add(max);
        }
           for(int i : list)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int  n = 6;
        int[] arr = {1,2,2,3,4,5};
        maximumAdjacent(n,arr);
    }
}
