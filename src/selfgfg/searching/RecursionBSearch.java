package selfgfg.searching;

public class RecursionBSearch {

    static int bSearch(int arr [] ,int low, int high, int key){

        if(low>high) return -1;

        int mid=(low+high)/2;

        if (arr[mid]==key){
            return mid;
        }
        else if (key < arr[mid]){
            return bSearch(arr,low,mid-1, key);
        } else
            return  bSearch(arr, mid+1,high,key);

    }

    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4 ,6};

        System.out.println("Search element at: "+ bSearch(arr,0,4,6));

    }
}
