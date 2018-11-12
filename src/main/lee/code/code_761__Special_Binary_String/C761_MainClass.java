package lee.code.code_761__Special_Binary_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C761_MainClass {
public static String testCase = "\"11011000\"";
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
            
            String ret = new Solution().makeLargestSpecial(S);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
