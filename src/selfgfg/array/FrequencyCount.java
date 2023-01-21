package selfgfg.array;

public class FrequencyCount {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int [] arr=new int [] {1,3,3,4,5,5,5,7,8,8};
        int [] count=new int[256];

        for(int i=0 ; i< arr.length ; i++){
            count[arr[i]]++;   //count[3]
        }
        for(int i=0 ; i< count.length ; i++){
            if(count[i]>1)
                System.out.println(""+ i+ "-->" +count[i]);
        }

    }
}
