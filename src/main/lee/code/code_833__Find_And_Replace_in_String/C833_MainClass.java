package lee.code.code_833__Find_And_Replace_in_String;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C833_MainClass {
public static String testCase = "\"abcd\"\n[0, 2]\n[\"a\", \"cd\"]\n[\"eee\", \"ffff\"]";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static int[] Utils.stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String S = Utils.stringToString(line);
            line = in.readLine();
            int[] indexes = Utils.stringToIntegerArray(line);
            line = in.readLine();
            String[] sources = Utils.stringToStringArray(line);
            line = in.readLine();
            String[] targets = Utils.stringToStringArray(line);
            
            String ret = new Solution().findReplaceString(S, indexes, sources, targets);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
