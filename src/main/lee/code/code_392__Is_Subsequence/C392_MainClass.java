package lee.code.code_392__Is_Subsequence;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C392_MainClass {
public static String testCase = "\"abc\"\n\"ahbgdc\"";
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
            line = in.readLine();
            String t = Utils.stringToString(line);
            
            boolean ret = new Solution().isSubsequence(s, t);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
