package lee.code.code_383__Ransom_Note;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C383_MainClass {
public static String testCase = "\"a\"\n\"b\"";
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
            String ransomNote = Utils.stringToString(line);
            line = in.readLine();
            String magazine = Utils.stringToString(line);
            
            boolean ret = new Solution().canConstruct(ransomNote, magazine);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
