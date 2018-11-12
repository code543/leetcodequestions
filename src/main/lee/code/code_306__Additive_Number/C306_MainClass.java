package lee.code.code_306__Additive_Number;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C306_MainClass {
public static String testCase = "\"112358\"";
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
            String num = Utils.stringToString(line);
            
            boolean ret = new Solution().isAdditiveNumber(num);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
