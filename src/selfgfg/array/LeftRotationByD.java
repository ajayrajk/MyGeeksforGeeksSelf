package selfgfg.array;

import java.util.Arrays;

public class LeftRotationByD {

    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        // First method sove problem but take more time like Nieve solution
        for(int i =0 ;i< d ; i++){
            rotateArrayByOne(arr,n);
        }
    }

    static void rotateArrayByOne(int [] array, int n){
        int temp=array[0];
        for (int i=1; i< n ; i++)
            array[i-1]=array[i];
        array[n-1]=temp;

    }

    static void rotateByD(int [] arr, int d, int n){
        int [] temp=new int[d];
        //copy all d value to temp array
        for(int i=0 ; i < d ; i++)
            temp[i]=arr[i];

        //move the remaining value in first place
        for (int i =d ; i< n ; i++ ){
              arr[i-d]=arr[i];
        }
        //copy temp value to next
        for(int i=0; i< d ; i++)
             arr[n-d+i]=temp[i];

    }

    static void reverseArray(int [] array, int s , int e){
        while(s<e){
            //swap
            int temp=array[s];
            array[s]=array[e];
            array[e]=temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
        //First method
       //rotateArr(arr,2,5);
       //second method
       // rotateByD(arr,2,5);

        //Third method
        int d=2;
        int n=5;

        /*
        * Important Tips d=d%n;
        * */
       /* If d> (size of array)  Let's say array size =5 and d=6 then
        it just means we have to rotate only 1 time ie 6%5 as after every 5 rotations array will be at same state
        Hence Rotation range can be only between 1 to 4 ie why we have take modulo n.*/
        d=d%n;

        reverseArray(arr,0,d-1);
        //
        reverseArray(arr,d,n-1);
        //reverse whole array
        reverseArray(arr,0,n-1);
       System.out.println(Arrays.toString(arr));
    }
}
