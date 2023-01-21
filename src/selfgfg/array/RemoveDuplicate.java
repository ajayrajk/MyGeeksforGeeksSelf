package selfgfg.array;

public class RemoveDuplicate {

   static int remove_duplicate(int A[],int N){
        // code here
        int count[]=new int [256];
        int temp=0;
        for(int i=0 ; i< N ; i++)
            count[A[i]]++;
        for(int i=0 ; i<A.length ; i++)
            if(A[i]>=1){
                temp=A[i];
                break;
            }
        return temp;
   }

    public static void main(String[] args) {
       int [] array = {2, 2, 2, 2, 2};
        System.out.println(remove_duplicate(array,5));
    }


}
