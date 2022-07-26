package selfgfg.string;

public class SubStringFind {


    public static void main(String[] args) {
        String value = "161207CAD140000,0";
        String str = "CAD";
        int strLength=str.length()-1;
        int j=0;
        int k=0, i=0;
        for ( i=0 ; i< value.length()-1 ;i++){

            j=i+1;
            k=0;
            while (k< strLength ){
                if (value.charAt(i)==str.charAt(k)){
                    i++;
                    k++;
                }else {
                    break;
                }
            }

         /* if (k==strLength)
                break;*/
            if (k==strLength) {
                System.out.println("start index : " + j + " end index :" + i);
                return;
            }
        }

    }
}
