package lee.code.code_205__Isomorphic_Strings;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C205_MainClass {
public static String testCase = "\"egg\"\n\"add\"";
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
            String s = Utils.stringToString(line);
            line = in.readLine();
            String t = Utils.stringToString(line);
            
            boolean ret = new Solution().isIsomorphic(s, t);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
