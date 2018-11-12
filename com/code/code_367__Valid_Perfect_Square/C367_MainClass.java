package lee.code.code_367__Valid_Perfect_Square;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C367_MainClass {
public static String testCase = "16";
/*
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            boolean ret = new Solution().isPerfectSquare(num);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
