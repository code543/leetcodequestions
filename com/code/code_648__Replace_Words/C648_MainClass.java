package lee.code.code_648__Replace_Words;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C648_MainClass {
public static String testCase = "[\"cat\", \"bat\", \"rat\"]\n\"the cattle was rattled by the battery\"";
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
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            List<String> dict = Utils.stringToStringList(line);
            line = in.readLine();
            String sentence = Utils.stringToString(line);
            
            String ret = new Solution().replaceWords(dict, sentence);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
