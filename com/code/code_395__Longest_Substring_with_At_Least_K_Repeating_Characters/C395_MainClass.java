package lee.code.code_395__Longest_Substring_with_At_Least_K_Repeating_Characters;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C395_MainClass {
public static String testCase = "\"aaabb\"\n3";
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
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            int ret = new Solution().longestSubstring(s, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
