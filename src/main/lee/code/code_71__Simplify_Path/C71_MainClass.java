package lee.code.code_71__Simplify_Path;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C71_MainClass {
public static String testCase = "\"/home/\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String path = Utils.stringToString(line);
            
            String ret = new Solution().simplifyPath(path);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
