package lee.code.code_423__Reconstruct_Original_Digits_from_English;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C423_MainClass {
public static String testCase = "\"owoztneoer\"";
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
            
            String ret = new Solution().originalDigits(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
