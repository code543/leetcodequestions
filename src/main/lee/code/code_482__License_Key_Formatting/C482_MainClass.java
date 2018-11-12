package lee.code.code_482__License_Key_Formatting;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C482_MainClass {
public static String testCase = "\"5F3Z-2e-9-w\"\n4";
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
            int K = Integer.parseInt(line);
            
            String ret = new Solution().licenseKeyFormatting(S, K);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
