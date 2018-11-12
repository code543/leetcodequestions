package lee.code.code_72__Edit_Distance;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C72_MainClass {
public static String testCase = "\"horse\"\n\"ros\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String word1 = Utils.stringToString(line);
            line = in.readLine();
            String word2 = Utils.stringToString(line);
            
            int ret = new Solution().minDistance(word1, word2);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
