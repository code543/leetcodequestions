package lee.code.code_869__Reordered_Power_of_2;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C869_MainClass {
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
            int N = Integer.parseInt(line);
            
            boolean ret = new Solution().reorderedPowerOf2(N);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
