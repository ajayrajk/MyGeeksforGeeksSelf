package z1media;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GetAPIResponse {

    public static void main(String[] args) throws IOException {

        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
            try {
                //URLConnection connection = url.openConnection();
                // connection.getInputStream();
                InputStreamReader inputStream =new InputStreamReader(url.openStream()) ;
                BufferedReader br=new BufferedReader(inputStream);
                String line="";
                while((line=br.readLine())!=null)
                    System.out.println(line);


                getJSON(line);


            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        } }
    public static String getJSON(String str) {
        Set<String> set = new HashSet<>();

        String[] sArr = str.split(",");
        String [] sA=sArr[2].split(";");

        return Arrays.toString(sA);
    }
}
