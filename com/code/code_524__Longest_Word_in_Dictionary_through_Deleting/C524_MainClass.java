package lee.code.code_524__Longest_Word_in_Dictionary_through_Deleting;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C524_MainClass {
public static String testCase = "\"abpcplea\"\n[\"ale\",\"apple\",\"monkey\",\"plea\"]";
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
            String s = Utils.stringToString(line);
            line = in.readLine();
            List<String> d = Utils.stringToStringList(line);
            
            String ret = new Solution().findLongestWord(s, d);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
