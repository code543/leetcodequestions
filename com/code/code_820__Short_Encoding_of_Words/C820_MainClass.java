package lee.code.code_820__Short_Encoding_of_Words;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C820_MainClass {
public static String testCase = "[\"time\", \"me\", \"bell\"]";
/*
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
            String[] words = Utils.stringToStringArray(line);
            
            int ret = new Solution().minimumLengthEncoding(words);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
