package lee.code.code_591__Tag_Validator;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C591_MainClass {
public static String testCase = "\"<DIV>This is the first line <![CDATA[<div>]]></DIV>\"";
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
            String code = Utils.stringToString(line);
            
            boolean ret = new Solution().isValid(code);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
