package lee.code.code_516__Longest_Palindromic_Subsequence;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C516_MainClass {
public static String testCase = "\"bbbab\"";
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
            
            int ret = new Solution().longestPalindromeSubseq(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
