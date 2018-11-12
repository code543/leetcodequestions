package lee.code.code_752__Open_the_Lock;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C752_MainClass {
public static String testCase = "[\"0201\",\"0101\",\"0102\",\"1212\",\"2002\"]\n\"0202\"";
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
            String[] deadends = Utils.stringToStringArray(line);
            line = in.readLine();
            String target = Utils.stringToString(line);
            
            int ret = new Solution().openLock(deadends, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
