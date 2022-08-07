package selfgfg.sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n) {
        //code here
        boolean swap=false;
        for(int i=0 ; i< n ; i++){
            for(int j=0; j< n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
    }
    public static void main(String[] args) {
      int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      bubbleSort(arr,arr.length);
      System.out.println("After Bubble sort");
      for (int i=0; i< arr.length ; i++)
          System.out.print(arr[i] +" ");
    }
}
