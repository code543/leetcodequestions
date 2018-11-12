package lee.code.code_890__Find_and_Replace_Pattern;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C890_MainClass {
public static String testCase = "[\"abc\",\"deq\",\"mee\",\"aqq\",\"dkd\",\"ccc\"]\n\"abb\"";
/*
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
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
            String[] words = Utils.stringToStringArray(line);
            line = in.readLine();
            String pattern = Utils.stringToString(line);
            
            List<String> ret = new Solution().findAndReplacePattern(words, pattern);
            
            String out = Utils.stringListToString(ret);
            
            System.out.print(out);
        }
    }
}
