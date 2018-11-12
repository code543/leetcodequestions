package lee.code.code_316__Remove_Duplicate_Letters;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C316_MainClass {
public static String testCase = "\"bcabc\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String s = Utils.stringToString(line);
            
            String ret = new Solution().removeDuplicateLetters(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
