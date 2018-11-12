package lee.code.code_467__Unique_Substrings_in_Wraparound_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C467_MainClass {
public static String testCase = "\"a\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String p = Utils.stringToString(line);
            
            int ret = new Solution().findSubstringInWraproundString(p);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
