package lee.code.code_202__Happy_Number;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C202_MainClass {
public static String testCase = "19";
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
            
            boolean ret = new Solution().isHappy(n);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
