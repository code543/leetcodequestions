package lee.code.code_557__Reverse_Words_in_a_String_III;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C557_MainClass {
public static String testCase = "\"Let's take LeetCode contest\"";
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
            
            String ret = new Solution().reverseWords(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
