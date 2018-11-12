package lee.code.code_831__Masking_Personal_Information;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C831_MainClass {
public static String testCase = "\"LeetCode@LeetCode.com\"";
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
            
            String ret = new Solution().maskPII(S);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
