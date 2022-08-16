package selfgfg.sorting;

public class SelectionSorting {
    public static void selectionSort(int array [], int n){
        for (int i =0 ; i  < n-1 ; i++ ){
            for (int j=i+1 ; j < n ; j++){
                    if(array[i]>array[j]){
                        int temp=array[i];
                         array[i]=array[j];
                         array[j]=temp;
                    }
            }
        }

    }

    public static void main(String[] args) {
         int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
         selectionSort( arr , arr.length );
          for (int item : arr)
          System.out.print("  "+item);
    }
}
