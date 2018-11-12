package lee.code.code_657__Robot_Return_to_Origin;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C657_MainClass {
public static String testCase = "\"UD\"";
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
            String moves = Utils.stringToString(line);
            
            boolean ret = new Solution().judgeCircle(moves);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
