package lee.code.code_829__Consecutive_Numbers_Sum;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C829_MainClass {
public static String testCase = "5";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int N = Integer.parseInt(line);
            
            int ret = new Solution().consecutiveNumbersSum(N);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
