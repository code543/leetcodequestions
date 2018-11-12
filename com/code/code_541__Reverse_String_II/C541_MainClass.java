package lee.code.code_541__Reverse_String_II;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C541_MainClass {
public static String testCase = "\"abcdefg\"\n2";
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
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            String ret = new Solution().reverseStr(s, k);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
