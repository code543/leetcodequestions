package lee.code.code_809__Expressive_Words;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C809_MainClass {
public static String testCase = "\"heeellooo\"\n[\"hello\", \"hi\", \"helo\"]";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
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
            String[] words = Utils.stringToStringArray(line);
            
            int ret = new Solution().expressiveWords(S, words);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
