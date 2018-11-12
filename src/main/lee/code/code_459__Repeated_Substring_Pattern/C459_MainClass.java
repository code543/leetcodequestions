package lee.code.code_459__Repeated_Substring_Pattern;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C459_MainClass {
public static String testCase = "\"abab\"";
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
            String s = Utils.stringToString(line);
            
            boolean ret = new Solution().repeatedSubstringPattern(s);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
