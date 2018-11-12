package lee.code.code_521__Longest_Uncommon_Subsequence_I_;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C521_MainClass {
public static String testCase = "\"aba\"\n\"cdc\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String a = Utils.stringToString(line);
            line = in.readLine();
            String b = Utils.stringToString(line);
            
            int ret = new Solution().findLUSlength(a, b);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
