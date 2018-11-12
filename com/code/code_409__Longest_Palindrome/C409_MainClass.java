package lee.code.code_409__Longest_Palindrome;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C409_MainClass {
public static String testCase = "\"abccccdd\"";
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
            
            int ret = new Solution().longestPalindrome(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
