package lee.code.code_771__Jewels_and_Stones;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C771_MainClass {
public static String testCase = "\"aA\"\n\"aAAbbbb\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String J = Utils.stringToString(line);
            line = in.readLine();
            String S = Utils.stringToString(line);
            
            int ret = new Solution().numJewelsInStones(J, S);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
