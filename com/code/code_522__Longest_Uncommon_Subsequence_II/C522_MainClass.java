package lee.code.code_522__Longest_Uncommon_Subsequence_II;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C522_MainClass {
public static String testCase = "[\"aba\",\"cdc\",\"eae\"]";
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
            String[] strs = Utils.stringToStringArray(line);
            
            int ret = new Solution().findLUSlength(strs);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
