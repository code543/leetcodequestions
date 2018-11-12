package lee.code.code_389__Find_the_Difference;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C389_MainClass {
public static String testCase = "\"abcd\"\n\"abcde\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String Utils.charToString(char c) {
        return Utils.stringToString(String.valueOf(c));
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String s = Utils.stringToString(line);
            line = in.readLine();
            String t = Utils.stringToString(line);
            
            char ret = new Solution().findTheDifference(s, t);
            
            String out = Utils.charToString(ret);
            
            System.out.print(out);
        }
    }
}
