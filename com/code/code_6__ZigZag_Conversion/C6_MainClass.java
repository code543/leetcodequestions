package lee.code.code_6__ZigZag_Conversion;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C6_MainClass {
public static String testCase = "\"PAYPALISHIRING\"\n3";
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
            int numRows = Integer.parseInt(line);
            
            String ret = new Solution().convert(s, numRows);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
