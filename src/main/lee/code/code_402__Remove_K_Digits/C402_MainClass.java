package lee.code.code_402__Remove_K_Digits;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C402_MainClass {
public static String testCase = "\"1432219\"\n3";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String num = Utils.stringToString(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            String ret = new Solution().removeKdigits(num, k);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
