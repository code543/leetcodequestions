package lee.code.code_686__Repeated_String_Match;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C686_MainClass {
public static String testCase = "\"abcd\"\n\"cdabcdab\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String A = Utils.stringToString(line);
            line = in.readLine();
            String B = Utils.stringToString(line);
            
            int ret = new Solution().repeatedStringMatch(A, B);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
