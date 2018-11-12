package lee.code.code_28__Implement_strStr__;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C28_MainClass {
public static String testCase = "\"hello\"\n\"ll\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String haystack = Utils.stringToString(line);
            line = in.readLine();
            String needle = Utils.stringToString(line);
            
            int ret = new Solution().strStr(haystack, needle);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
