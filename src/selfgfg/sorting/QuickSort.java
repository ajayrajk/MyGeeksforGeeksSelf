package selfgfg.sorting;

import java.util.Arrays;

public class QuickSort {
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pi=partition(arr,low, high);
            quickSort(arr, low , pi-1);
            quickSort(arr, pi+1 , high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        // take last as a pivot
        int pivot=arr[high];
        int i=low-1;

        for(int j=low ; j<high ; j++ ){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        // swap arr[i+1] and pivot;
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 4, 1, 3, 9, 7};
        quickSort(arr,0,N-1);
        System.out.println(Arrays.toString(arr));
    }
}
