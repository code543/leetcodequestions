package lee.code.code_736__Parse_Lisp_Expression;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C736_MainClass {
public static String testCase = "\"(add 1 2)\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String expression = Utils.stringToString(line);
            
            int ret = new Solution().evaluate(expression);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
