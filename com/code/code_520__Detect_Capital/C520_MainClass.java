package lee.code.code_520__Detect_Capital;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C520_MainClass {
public static String testCase = "\"USA\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String word = Utils.stringToString(line);
            
            boolean ret = new Solution().detectCapitalUse(word);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
