package lee.code.code_424__Longest_Repeating_Character_Replacement;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C424_MainClass {
public static String testCase = "\"ABAB\"\n2";
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
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            int ret = new Solution().characterReplacement(s, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
