package lee.code.code_828__Unique_Letter_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C828_MainClass {
public static String testCase = "\"ABC\"";
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
            
            int ret = new Solution().uniqueLetterString(S);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
