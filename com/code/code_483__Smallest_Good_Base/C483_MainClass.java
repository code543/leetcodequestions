package lee.code.code_483__Smallest_Good_Base;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C483_MainClass {
public static String testCase = "\"13\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String n = Utils.stringToString(line);
            
            String ret = new Solution().smallestGoodBase(n);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
