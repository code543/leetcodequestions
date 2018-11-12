package lee.code.code_633__Sum_of_Square_Numbers;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C633_MainClass {
public static String testCase = "5";
/*
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int c = Integer.parseInt(line);
            
            boolean ret = new Solution().judgeSquareSum(c);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
