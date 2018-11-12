package lee.code.code_507__Perfect_Number;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C507_MainClass {
public static String testCase = "28";
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
            
            boolean ret = new Solution().checkPerfectNumber(num);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
