package selfgfg.array;

import java.util.*;

public class DuplicateFromArray {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0 ; i< n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else
                hm.put(arr[i],1);
        }
        //list.add(arr[n-1]);
        Iterator<Map.Entry<Integer, Integer>> entrySet = hm.entrySet().iterator();
        while(entrySet.hasNext()){
            Map.Entry<Integer , Integer > entry=entrySet.next();
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        if(list.size()==0)
            list.add(-1);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int a[] = {0,3,1,2,5,7,3,7,9,2};
        System.out.println("Find Duplicate from List : "+ duplicates(a,10));
    }

}
/*
*
* Given an array a[] of size N which contains elements from 0 to N-1,
* you need to find all the elements occurring more than once in the given array.
Example 1:
Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
* */