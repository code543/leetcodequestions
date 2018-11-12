package lee.code.code_514__Freedom_Trail;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C514_MainClass {
public static String testCase = "\"godding\"\n\"gd\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String ring = Utils.stringToString(line);
            line = in.readLine();
            String key = Utils.stringToString(line);
            
            int ret = new Solution().findRotateSteps(ring, key);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
