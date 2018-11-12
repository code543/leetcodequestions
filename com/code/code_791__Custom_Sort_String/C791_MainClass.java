package lee.code.code_791__Custom_Sort_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C791_MainClass {
public static String testCase = "\"cba\"\n\"abcd\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String S = Utils.stringToString(line);
            line = in.readLine();
            String T = Utils.stringToString(line);
            
            String ret = new Solution().customSortString(S, T);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
