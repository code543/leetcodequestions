package lee.code.code_231__Power_of_Two;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C231_MainClass {
public static String testCase = "1";
/*
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            boolean ret = new Solution().isPowerOfTwo(n);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
