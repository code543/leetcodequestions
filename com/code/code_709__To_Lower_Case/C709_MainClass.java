package lee.code.code_709__To_Lower_Case;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C709_MainClass {
public static String testCase = "\"Hello\"";
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
            
            String ret = new Solution().toLowerCase(str);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
