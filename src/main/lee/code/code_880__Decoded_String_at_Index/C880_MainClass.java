package lee.code.code_880__Decoded_String_at_Index;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C880_MainClass {
public static String testCase = "\"leet2code3\"\n10";
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
            
            String ret = new Solution().decodeAtIndex(S, K);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
