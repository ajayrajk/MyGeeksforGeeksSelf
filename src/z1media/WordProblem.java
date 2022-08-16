package z1media;

import java.util.HashSet;
import java.util.Set;

public class WordProblem {

    public static String WordSplit(String[] strArr) {
        Set<String> set = new HashSet<>();
        String[] sArr = strArr[1].split(",");
        for (String s : sArr) {
            set.add(s);
        }
        for (int i=0; i<strArr[0].length(); i++) {
            String str1 = strArr[0].substring(0, i+1);
            if (set.contains(str1)) {
                String str2 = strArr[0].substring(i+1);
                if (set.contains(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str1);
                    sb.append(",");
                    sb.append(str2);
                    return sb.toString();
                }
            }
        }
        return "not possible";
    }

    public static void main(String[] args) {
        String [] strArr={"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        WordSplit(strArr);
    }
}
/*
*
* Input: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
Output: base,ball
* */