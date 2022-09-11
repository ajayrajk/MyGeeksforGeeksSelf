package selfgfg.array;

public class MajorityWins {

    public static int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int countX=0;
        int countY=0;
        for(int i=0 ; i< n ; i++){
            if(arr[i]==x)
                countX++;
            if(arr[i]==y)
                countY++;
        }
        if(countX==countY)
            return Math.min(x, y);
        return countX > countY ? x: y;
    }

    public static void main(String[] args) {
       int N = 11;
       int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
       int x = 4, y = 5;

       System.out.println("Majority Wins "+ majorityWins(arr,N,x,y));
    }
}
