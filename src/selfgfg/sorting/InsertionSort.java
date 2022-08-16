package selfgfg.sorting;

public class InsertionSort {

    public static void insertionSort(int arr[], int n)
    {
        //code here
        //code here
        for(int i=1 ; i< arr.length ; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort( arr , arr.length );
        for (int item : arr)
            System.out.print("  "+item);
    }
}
