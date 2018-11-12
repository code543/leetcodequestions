package lee.code.code_388__Longest_Absolute_File_Path;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C388_MainClass {
public static String testCase = "\"dir\\n\\tsubdir1\\n\\tsubdir2\\n\\t\\tfile.ext\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String input = Utils.stringToString(line);
            
            int ret = new Solution().lengthLongestPath(input);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
