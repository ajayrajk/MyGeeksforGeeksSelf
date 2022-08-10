package selfgfg.array;

public class SecondLargest {

    public static void main(String[] args) {
        int a[] = {11,9,13,7,14,21,25};
        //First lake the largest
        int largest=getLargest(a);
        int res=-1;
        for (int i=0 ; i< a.length ; i++){
               if (a[i]!=a[largest]){
                   if (res==-1)
                       res=i;
                   else if (a[i]>a[res])
                       res=i;
               }
        }
        System.out.println("Largest Element at index "+ res +" "+ largest);
    }

    static int getLargest(int [] arr){
        int largest=0;
        for (int i=0; i <arr.length ; i++){
            if (arr[i]>arr[largest])
                largest=i;
        }
        return largest;
    }

}
