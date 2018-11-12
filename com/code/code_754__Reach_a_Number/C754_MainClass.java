package lee.code.code_754__Reach_a_Number;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C754_MainClass {
public static String testCase = "1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int target = Integer.parseInt(line);
            
            int ret = new Solution().reachNumber(target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
