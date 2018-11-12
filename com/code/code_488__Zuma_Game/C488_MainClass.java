package lee.code.code_488__Zuma_Game;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C488_MainClass {
public static String testCase = "\"WRRBBW\"\n\"RB\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String board = Utils.stringToString(line);
            line = in.readLine();
            String hand = Utils.stringToString(line);
            
            int ret = new Solution().findMinStep(board, hand);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
