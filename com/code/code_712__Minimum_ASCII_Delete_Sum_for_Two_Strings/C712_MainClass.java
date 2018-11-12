package lee.code.code_712__Minimum_ASCII_Delete_Sum_for_Two_Strings;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C712_MainClass {
public static String testCase = "\"sea\"\n\"eat\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String s1 = Utils.stringToString(line);
            line = in.readLine();
            String s2 = Utils.stringToString(line);
            
            int ret = new Solution().minimumDeleteSum(s1, s2);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
