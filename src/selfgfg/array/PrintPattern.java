package selfgfg.array;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {

    static List<Integer> pattern(int N){
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int num=N;
        while(N>0){
            list.add(N);
            N=N-5;
        }
        while(N<num){
            list.add(N);
            N+=5;
        }

        list.add(num);

        return list;
    }

    public static void main(String[] args) {
        System.out.println("My Result :" + pattern(16));
    }
}
/*
* Print a sequence of numbers starting with N where A[0] = N,
* without using loop, in which  A[i+1] = A[i] - 5,
* until A[i] > 0. After that A[i+1] = A[i] + 5
* repeat it until A[i] = N.
* */