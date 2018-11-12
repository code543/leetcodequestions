package lee.code.code_691__Stickers_to_Spell_Word;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C691_MainClass {
public static String testCase = "[\"with\",\"example\",\"science\"]\n\"thehat\"";
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
            String[] stickers = Utils.stringToStringArray(line);
            line = in.readLine();
            String target = Utils.stringToString(line);
            
            int ret = new Solution().minStickers(stickers, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
