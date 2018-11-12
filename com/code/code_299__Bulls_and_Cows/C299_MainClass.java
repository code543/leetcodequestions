package lee.code.code_299__Bulls_and_Cows;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C299_MainClass {
public static String testCase = "\"1807\"\n\"7810\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String secret = Utils.stringToString(line);
            line = in.readLine();
            String guess = Utils.stringToString(line);
            
            String ret = new Solution().getHint(secret, guess);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
