package lee.code.code_792__Number_of_Matching_Subsequences;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C792_MainClass {
public static String testCase = "\"abcde\"\n[\"a\",\"bb\",\"acd\",\"ace\"]";
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
            
            int ret = new Solution().numMatchingSubseq(S, words);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
