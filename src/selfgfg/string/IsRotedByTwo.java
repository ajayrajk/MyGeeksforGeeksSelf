package selfgfg.string;

public class IsRotedByTwo {
    public static boolean isRotated(String str1, String str2)
    {
        int n=str1.length();
        int m=str2.length();
        if(n!=m)
            return false;
        //for clock wise rotation
        boolean clockWise=true, antiClockWise=true;
        for(int i=0 ; i< n ; i++){
            if(str1.charAt(i)!=str2.charAt((i+2)%n)){
                clockWise=false;
            }
        }
        for(int i=0 ; i< m ; i++){
            if(str1.charAt((i+2)%n)!=str2.charAt(i))
                antiClockWise=false;
        }

        return (antiClockWise || clockWise);

    }

    public static void main(String[] args) {
        String   a = "amazon";
        String  b = "azonam";

        System.out.println(isRotated(a,b));
    }
}
