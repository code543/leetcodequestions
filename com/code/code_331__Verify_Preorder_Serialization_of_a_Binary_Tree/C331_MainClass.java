package lee.code.code_331__Verify_Preorder_Serialization_of_a_Binary_Tree;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C331_MainClass {
public static String testCase = "\"9,3,4,#,#,1,#,#,2,#,6,#,#\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String preorder = Utils.stringToString(line);
            
            boolean ret = new Solution().isValidSerialization(preorder);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
