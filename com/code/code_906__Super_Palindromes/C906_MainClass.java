package lee.code.code_906__Super_Palindromes;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C906_MainClass {
public static String testCase = "\"4\"\n\"1000\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String L = Utils.stringToString(line);
            line = in.readLine();
            String R = Utils.stringToString(line);
            
            int ret = new Solution().superpalindromesInRange(L, R);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
