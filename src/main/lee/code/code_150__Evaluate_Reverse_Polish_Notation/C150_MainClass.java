package lee.code.code_150__Evaluate_Reverse_Polish_Notation;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C150_MainClass {
public static String testCase = "[\"2\",\"1\",\"+\",\"3\",\"*\"]";
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
            String[] tokens = Utils.stringToStringArray(line);
            
            int ret = new Solution().evalRPN(tokens);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
