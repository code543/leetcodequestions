package lee.code.code_796__Rotate_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C796_MainClass {
public static String testCase = "\"abcde\"\n\"cdeab\"";
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
            String A = Utils.stringToString(line);
            line = in.readLine();
            String B = Utils.stringToString(line);
            
            boolean ret = new Solution().rotateString(A, B);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
