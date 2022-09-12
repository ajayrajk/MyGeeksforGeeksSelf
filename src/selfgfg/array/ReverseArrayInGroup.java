package selfgfg.array;
import java.util.ArrayList;

public class ReverseArrayInGroup {
    static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0 ; i< n ; i=i+k){
            int left=i;
            int right=Math.min(i+k-1, n-1);
            while(left<right){
                int temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int N = 5, K = 3;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println( "Reverse Array in a Group:  "+reverseInGroups(list,N,K));
    }
}
