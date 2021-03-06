package lee.code.code_8__String_to_Integer__atoi_;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C8_MainClass {
public static String testCase = "\"42\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String str = Utils.stringToString(line);
            
            int ret = new Solution().myAtoi(str);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
