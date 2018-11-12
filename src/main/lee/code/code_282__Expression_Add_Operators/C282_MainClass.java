package lee.code.code_282__Expression_Add_Operators;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C282_MainClass {
public static String testCase = "\"123\"\n6";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String Utils.stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String num = Utils.stringToString(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            List<String> ret = new Solution().addOperators(num, target);
            
            String out = Utils.stringListToString(ret);
            
            System.out.print(out);
        }
    }
}
