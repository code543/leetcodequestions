package lee.code.code_165__Compare_Version_Numbers;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C165_MainClass {
public static String testCase = "\"0.1\"\n\"1.1\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String version1 = Utils.stringToString(line);
            line = in.readLine();
            String version2 = Utils.stringToString(line);
            
            int ret = new Solution().compareVersion(version1, version2);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
