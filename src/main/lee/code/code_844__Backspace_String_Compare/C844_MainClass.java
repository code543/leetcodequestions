package lee.code.code_844__Backspace_String_Compare;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C844_MainClass {
public static String testCase = "\"ab#c\"\n\"ad#c\"";
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
            String S = Utils.stringToString(line);
            line = in.readLine();
            String T = Utils.stringToString(line);
            
            boolean ret = new Solution().backspaceCompare(S, T);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
