package selfgfg.searching;

public class BinarySearching {
    static int binarySearch(int arr[], int n, int k){
        // code here
        int low=0 , high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int arr[] = {1 ,2 ,3 ,4 ,6};

       System.out.println("Search element at: "+ binarySearch(arr,5,6));

    }
}
