package lee.code.code_387__First_Unique_Character_in_a_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C387_MainClass {
public static String testCase = "\"leetcode\"";
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
            
            int ret = new Solution().firstUniqChar(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
