package lee.code.code_87__Scramble_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C87_MainClass {
public static String testCase = "\"great\"\n\"rgeat\"";
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
            String s1 = Utils.stringToString(line);
            line = in.readLine();
            String s2 = Utils.stringToString(line);
            
            boolean ret = new Solution().isScramble(s1, s2);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
