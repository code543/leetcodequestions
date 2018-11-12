package lee.code.code_730__Count_Different_Palindromic_Subsequences;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C730_MainClass {
public static String testCase = "\"bccb\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String S = Utils.stringToString(line);
            
            int ret = new Solution().countPalindromicSubsequences(S);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
