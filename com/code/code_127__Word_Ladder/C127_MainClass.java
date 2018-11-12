package lee.code.code_127__Word_Ladder;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C127_MainClass {
public static String testCase = "\"hit\"\n\"cog\"\n[\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"]";
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
            String beginWord = Utils.stringToString(line);
            line = in.readLine();
            String endWord = Utils.stringToString(line);
            line = in.readLine();
            List<String> wordList = Utils.stringToStringList(line);
            
            int ret = new Solution().ladderLength(beginWord, endWord, wordList);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
