package lee.code.code_564__Find_the_Closest_Palindrome;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C564_MainClass {
public static String testCase = "\"1\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String n = Utils.stringToString(line);
            
            String ret = new Solution().nearestPalindromic(n);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
