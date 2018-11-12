package lee.code.code_415__Add_Strings;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C415_MainClass {
public static String testCase = "\"0\"\n\"0\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String num1 = Utils.stringToString(line);
            line = in.readLine();
            String num2 = Utils.stringToString(line);
            
            String ret = new Solution().addStrings(num1, num2);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
