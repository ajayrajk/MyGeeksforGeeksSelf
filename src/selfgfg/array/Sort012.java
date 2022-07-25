package selfgfg.array;

public class Sort012 {

    public static void sort012( int a[],int n)
    {
        // code here
        int low=0, high=n-1 , mid=0 , temp=0;
        while(mid<=high){
            switch(a[mid]){
                case 0:{
                    temp=a[mid];
                    a[mid]=a[low];
                    a[low]=temp;
                    low++;
                    mid++;
                    break ;
                  }

                case 1:{
                    mid++;
                    break;
                }
                case 2:
                {
                    temp=a[mid];
                    a[mid]=a[high];
                    a[high]=temp;
                    high--;
                    break ;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]= {0 ,2 ,1 ,2, 0,1,0};
        sort012(a,7);
        for (int i=0; i<a.length ;i++)
         System.out.print(a[i]+" ");

    }
}
