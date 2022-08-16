package selfgfg.array;

public class FindLeaders {

   static void  leaders(int arr[] , int n){

       int currentLeader=arr[n-1];

       System.out.print(currentLeader+" ");

       for (int i=n-2 ; i>=0 ; i--){
           if(currentLeader < arr[i]){
               currentLeader=arr[i];
               System.out.print(currentLeader+" ");
           }
       }

   }

    public static void main(String args[])
    {
        int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

        leaders(arr, n);

    }

}
