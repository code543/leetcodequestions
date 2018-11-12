package lee.code.code_17__Letter_Combinations_of_a_Phone_Number;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C17_MainClass {
public static String testCase = "\"23\"";
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
            String digits = Utils.stringToString(line);
            
            List<String> ret = new Solution().letterCombinations(digits);
            
            String out = Utils.stringListToString(ret);
            
            System.out.print(out);
        }
    }
}
