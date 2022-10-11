package selfgfg.array;

public class Frequency {
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int [] count=new int [P+1];
        for(int i=0 ; i < N ; i++)
        {
            count[arr[i]]++;
        }
        for(int i=1; i<= P; i++){
            System.out.print( count[i] +" ");
        }

    }

    public static void main(String[] args) {
       int arr[] = {2, 3, 2, 3, 5};
       frequencyCount(arr,5,5);

    }
}
