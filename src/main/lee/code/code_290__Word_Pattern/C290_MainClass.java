package lee.code.code_290__Word_Pattern;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C290_MainClass {
public static String testCase = "\"abba\"\n\"dog cat cat dog\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String pattern = Utils.stringToString(line);
            line = in.readLine();
            String str = Utils.stringToString(line);
            
            boolean ret = new Solution().wordPattern(pattern, str);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
