package lee.code.code_67__Add_Binary;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C67_MainClass {
public static String testCase = "\"11\"\n\"1\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String a = Utils.stringToString(line);
            line = in.readLine();
            String b = Utils.stringToString(line);
            
            String ret = new Solution().addBinary(a, b);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
