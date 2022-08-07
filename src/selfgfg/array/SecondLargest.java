package selfgfg.array;

public class SecondLargest {

    public static void main(String[] args) {
        int a[] = {11,9,13,7,14,21,25};
        //suppose largest is 0 index
        int largest=0;
        int res=-1;
        for (int i=0 ; i< a.length ; i++){

             /* if (a[]){
                  res=largest;
                  largest=i;
              }else if (a[res] < a[i]){
                  res =i;
              }*/
        }

        System.out.println("Largest Element at index "+ res +" "+ largest);
    }

}
