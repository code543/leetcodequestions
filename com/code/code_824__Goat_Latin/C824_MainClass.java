package lee.code.code_824__Goat_Latin;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C824_MainClass {
public static String testCase = "\"I speak Goat Latin\"";
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
            
            String ret = new Solution().toGoatLatin(S);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
