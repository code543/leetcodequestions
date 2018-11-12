package lee.code.code_649__Dota2_Senate;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C649_MainClass {
public static String testCase = "\"RD\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String senate = Utils.stringToString(line);
            
            String ret = new Solution().predictPartyVictory(senate);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
