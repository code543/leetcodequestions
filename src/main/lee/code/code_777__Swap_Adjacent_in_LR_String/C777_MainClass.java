package lee.code.code_777__Swap_Adjacent_in_LR_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C777_MainClass {
public static String testCase = "\"X\"\n\"L\"";
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
            String start = Utils.stringToString(line);
            line = in.readLine();
            String end = Utils.stringToString(line);
            
            boolean ret = new Solution().canTransform(start, end);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
