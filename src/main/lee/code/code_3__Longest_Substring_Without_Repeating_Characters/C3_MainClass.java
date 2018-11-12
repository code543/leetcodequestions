package lee.code.code_3__Longest_Substring_Without_Repeating_Characters;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C3_MainClass {
public static String testCase = "\"abcabcbb\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String s = Utils.stringToString(line);
            
            int ret = new Solution().lengthOfLongestSubstring(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
