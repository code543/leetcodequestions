package lee.code.code_720__Longest_Word_in_Dictionary;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C720_MainClass {
public static String testCase = "[\"w\",\"wo\",\"wor\",\"worl\",\"world\"]";
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
            
            String ret = new Solution().longestWord(words);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
