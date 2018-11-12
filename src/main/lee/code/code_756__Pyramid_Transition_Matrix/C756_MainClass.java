package lee.code.code_756__Pyramid_Transition_Matrix;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C756_MainClass {
public static String testCase = "\"ABC\"\n[\"ABD\",\"BCE\",\"DEF\",\"FFF\"]";
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
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String bottom = Utils.stringToString(line);
            line = in.readLine();
            List<String> allowed = Utils.stringToStringList(line);
            
            boolean ret = new Solution().pyramidTransition(bottom, allowed);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
