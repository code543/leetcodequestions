package lee.code.code_692__Top_K_Frequent_Words;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C692_MainClass {
public static String testCase = "[\"i\", \"love\", \"leetcode\", \"i\", \"love\", \"coding\"]\n2";
/*
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
    public static String Utils.stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String[] words = Utils.stringToStringArray(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            List<String> ret = new Solution().topKFrequent(words, k);
            
            String out = Utils.stringListToString(ret);
            
            System.out.print(out);
        }
    }
}
