package lee.code.code_76__Minimum_Window_Substring;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C76_MainClass {
public static String testCase = "\"ADOBECODEBANC\"\n\"ABC\"";
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
            line = in.readLine();
            String t = Utils.stringToString(line);
            
            String ret = new Solution().minWindow(s, t);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
