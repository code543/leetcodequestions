package lee.code.code_647__Palindromic_Substrings;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C647_MainClass {
public static String testCase = "\"abc\"";
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
            
            int ret = new Solution().countSubstrings(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
